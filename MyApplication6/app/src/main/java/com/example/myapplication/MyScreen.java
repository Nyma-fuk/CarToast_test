package com.example.myapplication;

import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import androidx.car.app.CarToast;

public class MyScreen extends Screen {
    public MyScreen(CarContext carContext) {
        super(carContext);
    }

    @Override
    public Template onGetTemplate() {
        Action action = new Action.Builder()
                .setTitle("Show Toast")
                .setOnClickListener(() -> {
                    CarToast.makeText(getCarContext(), "CarToast Activated!", CarToast.LENGTH_SHORT).show();
                })
                .build();

        return new MessageTemplate.Builder("Press the button to show a CarToast")
                .setHeaderAction(Action.APP_ICON)
                .setActionStrip(new ActionStrip.Builder().addAction(action).build())
                .build();
    }
}
