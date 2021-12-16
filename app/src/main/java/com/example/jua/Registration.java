package com.example.jua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registration extends AppCompatActivity  implements View.OnClickListener{
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        button = (Button) findViewById(R.id.regenter);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent =new Intent(this,Codeconfirmation.class);
        startActivity(intent);

    }
}