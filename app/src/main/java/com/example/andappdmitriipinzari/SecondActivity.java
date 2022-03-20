package com.example.andappdmitriipinzari;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

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

//        UserViewModel viewModel;
//        viewModel = new ViewModelProvider(this).get(UserViewModel.class);
//        viewModel.insert(user);

        Button watchButton = findViewById(R.id.video);
        watchButton.setOnClickListener(view -> {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container,new SomeFragment()).commit();
        });


    }
}