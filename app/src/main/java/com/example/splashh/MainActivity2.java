package com.example.splashh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = findViewById(R.id.button_8);
        btn2 = findViewById(R.id.button_9);
        btn3 = findViewById(R.id.button_10);
        btn4 = findViewById(R.id.button_11);

        btn1.getBackground().setAlpha(90);
        btn2.getBackground().setAlpha(90);
        btn3.getBackground().setAlpha(90);
        btn4.getBackground().setAlpha(90);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Interview.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mcqquiz.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Interview.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://developer.android.com/");
               Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent1);

            }
        });
    }
}