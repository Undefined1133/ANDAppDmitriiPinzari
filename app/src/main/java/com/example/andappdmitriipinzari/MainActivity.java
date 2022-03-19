package com.example.andappdmitriipinzari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Everything is not up to date
        Button button = findViewById(R.id.nextActivity);
        button.setOnClickListener(v->{
Intent intent = new Intent(this,SecondActivity.class);
intent.putExtra("username","kasper1133");
startActivity(intent);
        });
    }

}