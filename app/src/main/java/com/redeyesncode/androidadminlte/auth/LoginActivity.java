package com.redeyesncode.androidadminlte.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.redeyesncode.androidadminlte.DashboardActivity;
import com.redeyesncode.androidadminlte.base.BaseActivity;
import com.redeyesncode.androidadminlte.databinding.ActivityLoginBinding;

public class LoginActivity extends BaseActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding = ActivityLoginBinding.inflate(getLayoutInflater());
        initClicks();
        setContentView(binding.getRoot());


    }
    private void initView(){


    }

    private void initClicks() {
        binding.btnLogin.setOnClickListener(v->{
            Intent dashBoardActivity = new Intent(this, DashboardActivity.class);
            startActivity(dashBoardActivity);
            finish();
        });
    }
}