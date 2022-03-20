package com.example.andappdmitriipinzari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        RegisterFragment registerFragment = new RegisterFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.registerContainer, registerFragment).commit();


    }
}