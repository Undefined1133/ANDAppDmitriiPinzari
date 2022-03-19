package com.example.andappdmitriipinzari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        String account  =  bundle.getString("account");
        Gson gson = new Gson();
        User user = gson.fromJson(account,User.class);


        TextView usernameView = findViewById(R.id.username);
        usernameView.setText(user.getFirstName());
    }
}