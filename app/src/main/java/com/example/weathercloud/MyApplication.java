package com.example.weathercloud;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

public class MyApplication extends Application {
    private Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePal.initialize(this);
    }
    public Context getContext() {
        return context;
    }
}
