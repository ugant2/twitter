package com.yograj.twitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {

    ImageView  twLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        twLogo = findViewById(R.id.twLogo);

//        Using a thread and halt screen for 2 seconds.
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, DashboardActivity.class);
                startActivity(intent);
                finish(); //close the activity
            }
        }, 2000);

    }
}
