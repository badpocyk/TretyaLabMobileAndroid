package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSendToActivity(View view){

        Time time = new Time("yyyy-MM-dd HH:mm:ss");
        String systemTime = time.getSystemTime();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("systemTime", systemTime);

        startActivity(intent);

    }
}
