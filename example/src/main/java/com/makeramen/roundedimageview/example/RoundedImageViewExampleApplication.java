package com.makeramen.roundedimageview.example;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class RoundedImageViewExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
