package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button introBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //making button move to Intro screen
        introBtn = (Button) findViewById(R.id.intro);
        introBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityI();
            }
        });

    }

    public void openActivityI()
    {
        Intent intent = new Intent(this, Introduction.class);
        startActivity(intent);
    }
}