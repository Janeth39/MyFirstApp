package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TopFive extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_five);

        //making button move to Intro screen
        Button HomeBtn = (Button) findViewById(R.id.Home);

        HomeBtn.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                openActivityI();
            }
        });

    }

    public void openActivityI()
    {
                startActivity(new Intent(this, MainActivity.class));
    }
}