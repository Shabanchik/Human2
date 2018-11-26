package com.example.pupil.human2.human;



import timber.log.Timber;

public abstract class Human implements HumanInterface {
    private String name;
    private String lastName;
    private String gender;
    private String race;
    private String country;


    private int age;
    private int height;
    private int weight;

    @Override
    public void go() {
        Timber.d("I can go");
    }
    @Override
    public void run() {

        Timber.d("I can run");

    }

    @Override
    public void eat() {
        Timber.d("I can eat");

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }


}
