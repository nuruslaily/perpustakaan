package com.example.myproject.viewmodels;

import androidx.lifecycle.ViewModel;

import android.util.Patterns;
import com.example.myproject.models.LoggedInUser;

public class LoginViewModel extends ViewModel {

    public void login(String username, String password) {

    }


    // A placeholder username validation check
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }
}