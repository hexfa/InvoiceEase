package com.example.invoiceease.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.invoiceease.R;
import com.example.invoiceease.databinding.ActivityRegisterBinding;
import com.example.invoiceease.model.Auth;
import com.example.invoiceease.model.Users;
import com.example.invoiceease.viewmodel.AuthViewModel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegisterActivity extends AppCompatActivity {
    private ActivityRegisterBinding mBinding;
    private AuthViewModel authViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        authViewModel = new ViewModelProvider(this).get(AuthViewModel.class);


        Window window = getWindow();
        window.setNavigationBarColor(ContextCompat.getColor(this, R.color.windowBlue));
        window.setBackgroundDrawableResource(R.color.cardBlue);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.cardBlue));

        mBinding.regBtn.setOnClickListener(view -> {
            String email_id = mBinding.email.getText().toString();
            String pass = mBinding.pass.getText().toString();
            String pass2 = mBinding.pass2.getText().toString();
            String fName = mBinding.firstName.getText().toString();
            String lName = mBinding.lastName.getText().toString();
            String mob = mBinding.mobileNumber.getText().toString();
            String add = mBinding.address.getText().toString();

            if (fName.equals("") || lName.equals("") || mob.equals("") || email_id.equals("") || pass.equals("") || pass2.equals("") || add.equals("")) {
                if (fName.equals("")) {
                    mBinding.firstName.setError("First Name is required");
                } else if (lName.equals("")) {
                    mBinding.lastName.setError("Last Name is required");
                } else if (mob.equals("") || mob.length() != 10) {
                    mBinding.mobileNumber.setError("Mobile Number is required");
                } else if (isEmailValid(email_id)) {
                    mBinding.email.setError("Invalid Email");
                } else if (pass.equals("") || pass.length() < 6) {
                    mBinding.pass.setError("Enter proper password");
                } else if (pass2.equals("") || pass2.length() < 6) {
                    mBinding.pass2.setError("Enter proper password");
                } else if (add.equals("")) {
                    mBinding.address.setError("Address is required");
                }
            } else {
                if (pass.equals(pass2)) {
                    register(email_id);
                }
            }

        });
    }

    public void register(String email) {
        authViewModel.createAccount(new Auth(email, mBinding.pass.getText().toString())).
                observe(this, new Observer<Auth>() {
            @Override
            public void onChanged(Auth auth) {
                authViewModel.addUser(new Users(email, mBinding.firstName.getText().toString(), mBinding.lastName.getText().toString(),
                                email, mBinding.mobileNumber.getText().toString(),
                                mBinding.address.getText().toString())).
                        observe(RegisterActivity.this, users -> {
                            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                            startActivity(intent);
                        });
            }
        });


    }

    public static boolean isEmailValid(String emailAddress) {
        Pattern pattern = Pattern.compile("^[A-Z0-9_.!#$%&'*+/=?`{|}~^-]+(?:\\.[A-Z0-9_.!#$%&'*+/=?`{|}~^-]+↵\n" +
                ")*@[A-Z0-9-]+(?:\\.[A-Z0-9-]+)*$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(emailAddress);
        return !matcher.find();
    }

}