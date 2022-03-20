package com.example.andappdmitriipinzari;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class UserViewModel extends AndroidViewModel {
    private UserRepository userRepository;
    public UserViewModel(@NonNull Application application) {
        super(application);
        userRepository = UserRepository.getInstance(application);
    }

    public LiveData<List<User>> getUsers(){
        return userRepository.getAllUsers();
    }
    public void insert(User user){
        userRepository.insert(user);
    }
//    public void retrieveData(){
//        isLoading.setValue(true);
//        new Timer().schedule(new TimerTask() {
//            @Override
//            public void run() {
//                message.postValue("Hello i guess");
//                isLoading.postValue(false);
//            }
//        },3000);
//    }
}
