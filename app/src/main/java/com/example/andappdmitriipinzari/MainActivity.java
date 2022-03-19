package com.example.andappdmitriipinzari;

import androidx.appcompat.app.AppCompatActivity;

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
        //Everything is not up to date
        Button button = findViewById(R.id.nextActivity);
        EditText password = findViewById(R.id.password);
        EditText email = findViewById(R.id.email);
        EditText login = findViewById(R.id.Login);
        EditText firstName = findViewById(R.id.firstName);
        EditText lastName = findViewById(R.id.LastName);

        button.setOnClickListener(v -> {
            User user = new User(0,firstName.getText().toString(),lastName.getText().toString(),login.getText().toString(),password.getText().toString(),email.getText().toString());
            Intent intent = new Intent(this, SecondActivity.class);
            Gson gson = new Gson();
            String userGson = gson.toJson(user);
//            String userString = gson.toString();
            intent.putExtra("account", userGson.trim());
            startActivity(intent);
        });


        ImageView searchImage = findViewById(R.id.imageView);
        searchImage.setOnClickListener(v -> {
            Uri uri = Uri.parse("http://www.google.com");
            String action = Intent.ACTION_VIEW;
            Intent intent = new Intent(action, uri);
            //Remember, there is startActivityForResult, in order to wait
            // for a certain action from user
            startActivity(intent);
        });

    }
}