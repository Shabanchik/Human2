package com.example.pupil.human2.human;

import android.util.Log;

import timber.log.Timber;

public class Pupil extends Human implements PupilInterface {


    @Override
    public void write() {
        Timber.d("I can write");

    }

    @Override
    public void read() {
        Timber.d("I can read");
        Log.d("","I can read");
        Timber.d("I love live");
        Log.d("","I love live");
    }

    public Pupil() {
    }
    public Pupil(String name) {

    }
    public Pupil(String name,String surname) {
        this.setName(name);
        this.setLastName(surname);

    }

}
