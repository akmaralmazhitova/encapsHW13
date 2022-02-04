package com.company;

public class Cat {
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
        void getInfoCat(){
            System.out.println("About Cat class: "+ getName() +", "+ getColor() +", "+ getType() +", "+ getAge());

        }
        void getHomeCat(){
            System.out.println("Cat lives inside of home.");
        }

}
