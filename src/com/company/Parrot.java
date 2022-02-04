package com.company;

public class Parrot {
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
        if (age > 18){
            this.age = age;
            System.out.println("Age of Parrot bigger than 18");}
        else { this.age = age;
            System.out.println("Age of Parrot smaller than 18");}
        }

    void getInfoParrot(){
        System.out.println("About Parrot class: "+ getName() +", "+ getColor() +", "+ getType() +", "+ getAge());
    }
}
