package com.example.splashh;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent( getApplicationContext(),MainActivity2.class);
                startActivity(i);
            }
        },4000);

        ImageView iv = findViewById(R.id.imageView2);
        Animation anm = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.buffer);
        iv.startAnimation(anm);
    }
}