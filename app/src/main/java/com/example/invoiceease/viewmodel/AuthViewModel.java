package com.example.invoiceease.viewmodel;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.invoiceease.model.Auth;
import com.example.invoiceease.model.Users;
import com.example.invoiceease.repository.AuthRepository;


public class AuthViewModel extends ViewModel {

    private AuthRepository repository;

    @ViewModelInject
    public AuthViewModel(AuthRepository repository) {
        this.repository = repository;
    }

    public MutableLiveData<String> onLogIn(String email, String password) {
        return repository.onLogIn(email, password);
    }

    public MutableLiveData<Users> fetchUser(String email) {
        return AuthRepository.fetchUsers(email);
    }

    public MutableLiveData<Users> addUser(Users users) {
        return repository.createUser(users);
    }

    public void updateAccount(String email, Auth auth) {
        repository.updateAccount(email, auth);
    }

    public MutableLiveData<Auth> createAccount(Auth auth) {
        return repository.createAccount(auth);
    }

    public void deleteAccount(String email) {
        repository.deleteAccount(email);
    }
}
