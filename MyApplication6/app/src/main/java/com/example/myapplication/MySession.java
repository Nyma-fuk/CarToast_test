package com.example.myapplication;
import androidx.car.app.Screen;
import androidx.car.app.Session;
import android.content.Intent;

public class MySession extends Session {
    public MySession() {
        super();
    }

    @Override
    public Screen onCreateScreen(Intent intent) {
        return new MyScreen(getCarContext());
    }
}

