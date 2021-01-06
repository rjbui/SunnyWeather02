package com.example.sunnyweather1;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {

    public static final String TOKEN="N8QTYowWwt7vWDMh";
    @SuppressLint("StaticFiledLeak")
    static public Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }
}
