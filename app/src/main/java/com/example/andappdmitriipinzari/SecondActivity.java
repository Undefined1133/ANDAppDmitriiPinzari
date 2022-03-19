package com.example.andappdmitriipinzari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        String username  = bundle.getString("username");

        TextView usernameView = findViewById(R.id.username);
        usernameView.setText(username);
    }
}