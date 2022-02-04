package com.company;

public class Dog {
    private String name;
    private String color;
    private String type;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void getInfoDog(){
        System.out.println("About Dog class: "+ getName() +", "+ getColor() +", "+ getType() +", "+ getAge());
    }
    void getHomeDog(){
        System.out.println("Dog lives outside of home.");}
}
