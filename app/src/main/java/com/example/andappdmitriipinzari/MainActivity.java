package com.example.andappdmitriipinzari;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import android.view.LayoutInflater;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.gson.Gson;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button registrationFragment = findViewById(R.id.registerButton);

        registrationFragment.setOnClickListener(view -> {
//            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//            transaction.replace(R.id.loginRegisterContainer,new RegisterFragment()).commit();
            Intent intent = new Intent(this,RegisterActivity.class);
            startActivity(intent);
        });

        Button loginFragment = findViewById(R.id.loginButton);
        loginFragment.setOnClickListener(view -> {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.loginRegisterContainer,new LoginFragment()).commit();
        });








    }
}