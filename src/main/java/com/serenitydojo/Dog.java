package com.serenitydojo;

public class Dog {

    private int age;
    private String name;
    private String favoriteToy;
    public static final String DOG_NOISE = "Miau";

    Boolean IsFed;

    public Dog(String fido, String bone, int i) {
        name=fido;
        favoriteToy=bone;
        age=i;
    }

    public String setName(String sname){
        name=sname;
        return this.name;
    }
    public String setFavoriteToy(String favToy){
        favoriteToy=favToy;
        return this.favoriteToy;
    }
    public Integer setAge(Integer iAge){
        age=iAge;
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getFavoriteToy() {
        return this.favoriteToy;
    }

    public int getAge() {
        return this.age;
    }

    public String makeNoise(){
        return DOG_NOISE;
    }

    public void setFeed(Boolean fedDesition){
        IsFed=fedDesition;
    }

}
