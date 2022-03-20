package com.example.andappdmitriipinzari;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TouchFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_touch, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.hasFixedSize();

//Populating with Arraylist for now, since Database not working yet

ArrayList<User> users =new ArrayList<>();
users.add(new User(1,"Dmitrii","Pinzari","coolnick011","idk2233","coolnick011@mail.ru"));
users.add(new User(2,"Malap","Tandir","malachuk32","kasperhello","jasperwasclose@gmail.com"));
UserAdapter userAdapter =new UserAdapter(users);
userAdapter.setOnClickListener(user -> {
    Toast.makeText(this.getContext(), user.getFirstName(), Toast.LENGTH_SHORT).show();
});
recyclerView.setAdapter(userAdapter);





        return view;
    }
}