package com.example.myapplication;

import androidx.car.app.CarAppService;
import androidx.car.app.Screen;
import androidx.car.app.Session;
import androidx.car.app.validation.HostValidator;
import android.content.Intent;

public class MyCarAppService extends CarAppService {
    @Override
    public Session onCreateSession() {
        return new Session() {
            @Override
            public Screen onCreateScreen(Intent intent) {
                return new MyScreen(getCarContext());
            }
        };
    }

    @Override
    public HostValidator createHostValidator() {
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR;
    }
}
