package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Intro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        //making button move to Intro screen
        Button introBtn = (Button) findViewById(R.id.nextbtn);

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
        Button introBtn = (Button) findViewById(R.id.nextbtn);
        introBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                startActivity(new Intent(Intro.this, TopFive.class));
                Toast.makeText( null ,"Opening Top Five Page", Toast.LENGTH_LONG).show();

            } // end onCLick
        });
    }
}