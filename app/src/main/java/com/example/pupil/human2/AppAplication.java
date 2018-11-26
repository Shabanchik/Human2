package com.example.pupil.human2;

import android.app.Application;
import android.util.Log;

import timber.log.Timber;

public class AppAplication extends Application {


    @Override
    public void onCreate ()
    {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
        Log.d("","I work!!!");
    }

}
