package com.example.andappdmitriipinzari;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

import androidx.core.os.HandlerCompat;
import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.transform.Result;

public class UserRepository {
    private UserDao userDao;
    private static UserRepository instance;
    private LiveData<List<User>> allUsers;

    private UserRepository(Application application) {
        UserDatabase database = UserDatabase.getInstance(application);
        userDao = database.getUserDao();
        allUsers = userDao.getAllNotes();
    }

    public static synchronized UserRepository getInstance(Application application) {
        if (instance == null)
            instance = new UserRepository(application);

        return instance;
    }

    public LiveData<List<User>> getAllUsers() {
        return allUsers;
    }

    public void insert(User user) {
        userDao.insert(user);
    }



}
