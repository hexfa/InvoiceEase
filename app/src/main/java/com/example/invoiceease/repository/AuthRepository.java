package com.example.invoiceease.repository;


import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.invoiceease.api.InvoiceApi;
import com.example.invoiceease.model.Auth;
import com.example.invoiceease.model.Report;
import com.example.invoiceease.model.Users;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class AuthRepository {
    private InvoiceApi api;


    @Inject
    public AuthRepository(InvoiceApi invoiceApiService) {
        this.api = invoiceApiService;
    }

    public static MutableLiveData<Users> fetchUsers(String email){
        MutableLiveData<Users> usersMutableLiveData;
        usersMutableLiveData = new MutableLiveData<>();
        Call<Users> call = api.getUser(email);
        call.enqueue(new Callback<Users>() {
            @Override
            public void onResponse(@NonNull Call<Users> call, @NonNull Response<Users> response) {
                if (!response.isSuccessful()) {
                    return;
                }
                assert response.body() != null;
                usersMutableLiveData.setValue(response.body());
//                Toast.makeText(application, ""+response.body().getPassword(), Toast.LENGTH_SHORT).show();
            }


            @Override
            public void onFailure(@NonNull Call<Users> call, @NonNull Throwable t) {
            }
        });
        return usersMutableLiveData;
    }

    public MutableLiveData<String> onLogIn(String email, String password){
        MutableLiveData<String> usersMutableLiveData;
        usersMutableLiveData = new MutableLiveData<>();
        Auth auth = new Auth(email,password);
        Call<String> call = api.getAuth(auth);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(@NonNull Call<String> call, @NonNull Response<String> response) {
                if (!response.isSuccessful()) {

                    return;
                }
                assert response.body() != null;
                usersMutableLiveData.setValue(response.headers().get("Auth-Token"));
            }


            @Override
            public void onFailure(@NonNull Call<String> call, @NonNull Throwable t) {

            }
        });
        return usersMutableLiveData;
    }

    public void updateAccount(String email, Auth auth){
        Call<Auth> call = api.updateAccount(email,auth);
        call.enqueue(new Callback<Auth>() {
            @Override
            public void onResponse(@NonNull Call<Auth> call, @NonNull Response<Auth> response) {
                if (!response.isSuccessful()) {
                    return;
                }
            }


            @Override
            public void onFailure(@NonNull Call<Auth> call, @NonNull Throwable t) {
            }
        });
    }

    public MutableLiveData<Users> createUser( Users users){
        MutableLiveData<Users> usersMutableLiveData = new MutableLiveData<>();
        Call<Users> call = api.createUser( users);
        call.enqueue(new Callback<Users>() {
            @Override
            public void onResponse(Call<Users> call, Response<Users> response) {
                if (!response.isSuccessful()) {
                    return;
                }
                usersMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<Users> call, Throwable t) {

            }
        });
        return usersMutableLiveData;
    }

    public MutableLiveData<Auth> createAccount(Auth auth) {
        MutableLiveData<Auth> authMutableLiveData = new MutableLiveData<>();
        Call<Auth> call = api.createAccount( auth);
        call.enqueue(new Callback<Auth>() {
            @Override
            public void onResponse(Call<Auth> call, Response<Auth> response) {
                if (!response.isSuccessful()) {
                    return;
                }
                authMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<Auth> call, Throwable t) {

            }
        });
        return authMutableLiveData;
    }



    public void deleteAccount(String email){
        Call<Auth> call = api.deleteAccount(email);
        call.enqueue(new Callback<Auth>() {
            @Override
            public void onResponse(Call<Auth> call, Response<Auth> response) {
                if (!response.isSuccessful()) {
                    return;
                }

            }

            @Override
            public void onFailure(Call<Auth> call, Throwable t) {

            }
        });
    }





}







