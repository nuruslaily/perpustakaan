package com.example.myproject.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myproject.R;
import com.example.myproject.databinding.FragmentLoginBinding;
import com.example.myproject.viewmodels.LoginViewModel;

public class LoginFragment extends Fragment {

    private LoginViewModel loginViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle
                                         savedInstanceState) {
        FragmentLoginBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false);
        loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);
        binding.setLoginViewModel(loginViewModel);
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }
}