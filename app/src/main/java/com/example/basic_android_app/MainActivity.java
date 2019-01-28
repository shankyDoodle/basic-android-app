package com.example.basic_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonStart = findViewById(R.id.button_id_start);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LottieAnimationView animationView = findViewById(R.id.animation_view);
                animationView.resumeAnimation();
            }
        });

        Button buttonStop = findViewById(R.id.button_id_stop);
        buttonStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LottieAnimationView animationView = findViewById(R.id.animation_view);
                animationView.pauseAnimation();
            }
        });
    }
}
