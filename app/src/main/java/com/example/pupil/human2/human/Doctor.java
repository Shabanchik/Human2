package com.example.pupil.human2.human;

import android.util.Log;

import timber.log.Timber;

public class Doctor extends Human implements DoctorInterface, PupilInterface {

    @Override
    public void write() {
        Timber.d("I can write");
        Log.d("","I can read");

    }

    @Override
    public void read() {
        Timber.d("I can read");
        Log.d ("","I can read");
    }

    @Override
    public void heal() {
        Timber.d("I can heal");
        Log.d ("","I can health");
    }

    @Override
    public void analyzing() {
        Timber.d("I can analyzing");
        Log.d ("","I can analyzing");

    }
}
