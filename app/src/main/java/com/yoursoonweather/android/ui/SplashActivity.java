package com.yoursoonweather.android.ui;


import static com.yoursoonweather.library.BaseApplication.context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.yoursoonweather.android.MainActivity;
import com.yoursoonweather.android.R;
import com.yoursoonweather.android.viewmodel.MainViewModel;

public class SplashActivity extends AppCompatActivity {
    /**
     * 进入主页面
     */
    private void goToMain() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        }, 5000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // 设置活动的布局
        goToMain();
    }

}