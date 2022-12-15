package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //making button move to Intro screen
        Button introBtn = (Button) findViewById(R.id.intro);

        introBtn.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                openActivityI();
            }
        });

    }

    public void openActivityI()
    {
        Button introBtn = (Button) findViewById(R.id.intro);
        introBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                startActivity(new Intent(MainActivity.this, Intro.class));
                Log.i("info", "opened intro screen");
            } // end onCLick
        });
    }
}