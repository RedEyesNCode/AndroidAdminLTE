package com.redeyesncode.androidadminlte.base;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {


    private CommonProgressDialog commonProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        commonProgressDialog = new CommonProgressDialog(this);
    }

    public void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void showLoader(){
        if(!commonProgressDialog.isShowing()){
            commonProgressDialog.show();
        }

    }
    public void hideLoader(){
        if(commonProgressDialog.isShowing()){
            commonProgressDialog.hide();
        }
    }
    public void showLog(String message){
        Log.i(Constants.TAG_LTE,message);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

}
