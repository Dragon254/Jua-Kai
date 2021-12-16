package com.example.jua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class LogIn extends AppCompatActivity implements View.OnClickListener{
    Button button;
    TextView texti,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        button= (Button) findViewById(R.id.enter);
        texti= (TextView) findViewById(R.id.reset);
        text2= (TextView) findViewById(R.id.member);
        button.setOnClickListener(this);
        texti.setOnClickListener(this);
        text2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.enter:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.reset:
                Intent intent2 = new Intent(this, PassReset.class);
                startActivity(intent2);
                break;
            case R.id.member:
                Intent intent3 = new Intent(this, Registration.class);
                startActivity(intent3);
                break;
        }


    }
}