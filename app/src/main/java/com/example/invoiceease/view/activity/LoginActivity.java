package com.example.invoiceease.view.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.invoiceease.R;
import com.example.invoiceease.databinding.ActivityLoginBinding;
import com.example.invoiceease.viewmodel.AuthViewModel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private ActivityLoginBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);


        AuthViewModel AuthViewModel = new ViewModelProvider(this).get(AuthViewModel.class);

        Window window = getWindow();
        window.setNavigationBarColor(ContextCompat.getColor(this, R.color.windowBlue));
        window.setBackgroundDrawableResource(R.color.cardBlue);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.cardBlue));

        sharedPreferences = getSharedPreferences("loggedIn", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        mBinding.forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(LoginActivity.this, .class);
//                startActivity(intent);
            }
        });


        mBinding.reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);*/
            }
        });

        mBinding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEmailValid(mBinding.emailLogin.getText().toString())) {
                    if (mBinding.passLogin.getText().toString().length() > 5) {
                        AuthViewModel.onLogIn(mBinding.emailLogin.getText().toString(), mBinding.passLogin.getText().toString()).observe(LoginActivity.this, new Observer<String>() {

                            @Override
                            public void onChanged(String token) {
                                if (token != null) {
                                    if (!token.equals("")) {
                                        editor.putBoolean("loggedIn", true);
                                        editor.putString("email", mBinding.emailLogin.getText().toString());
                                        editor.putString("token", token);
                                        editor.apply();
                                        //
                                       /* Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                                        startActivity(intent);*/
                                    }
                                }
                            }

                        });
                    }
                } else {
                    Toast.makeText(LoginActivity.this, "Invalid Email", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public static boolean isEmailValid(String emailAddress) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.find();
    }


}