package com.example.andappdmitriipinzari;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.gson.Gson;

public class RegisterFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
View view = inflater.inflate(R.layout.register_fragment,container,false);
        EditText password = view.findViewById(R.id.password);
        EditText email = view.findViewById(R.id.email);
        EditText login = view.findViewById(R.id.Login);
        EditText firstName = view.findViewById(R.id.firstName);
        EditText lastName = view.findViewById(R.id.LastName);

                Button finishRegistrationButton = view.findViewById(R.id.finishRegistration);
        finishRegistrationButton.setOnClickListener(v -> {
            User user = new User(0,firstName.getText().toString(),lastName.getText().toString(),login.getText().toString(),password.getText().toString(),email.getText().toString());
            Intent intent = new Intent(view.getContext(), SecondActivity.class);
            Gson gson = new Gson();
            String userGson = gson.toJson(user);
//            String userString = gson.toString();
            intent.putExtra("account", userGson.trim());
            startActivity(intent);
        });
                ImageView searchImage = view.findViewById(R.id.imageView);
        searchImage.setOnClickListener(v -> {
            Uri uri = Uri.parse("http://www.google.com");
            String action = Intent.ACTION_VIEW;
            Intent intent = new Intent(action, uri);
            //Remember, there is startActivityForResult, in order to wait
            // for a certain action from user
            startActivity(intent);
        });
        return view;
    }

}
