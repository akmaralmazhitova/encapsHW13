package com.company;

public class Main {

    public static void main(String[] args) {

        Fish fh1 = new Fish();
        fh1.setName("Nemo");
        fh1.setColor("white");
        fh1.setType("fish");
        fh1.setAge(18);

        fh1.getInfoFifh();

        Parrot pr1 = new Parrot();
        pr1.setName("Roxy");
        pr1.setColor("blue");
        pr1.setType("bird");
        pr1.setAge(25);

        pr1.getInfoParrot();

        Parrot pr2 = new Parrot();
        pr2.setName("Roxy");
        pr2.setColor("blue");
        pr2.setType("bird");
        pr2.setAge(13);

        pr2.getInfoParrot();

        Cat ct1 = new Cat();
        ct1.setName("Boss");
        ct1.setColor("black");
        ct1.setType("mammals");
        ct1.setAge(30);

        ct1.getInfoCat();
        ct1.getHomeCat();

        Dog dg1 = new Dog();
        dg1.setName("Bobi");
        dg1.setColor("yellow");
        dg1.setType("mammals");
        dg1.setAge(15);

        dg1.getInfoDog();
        dg1.getHomeDog();

    }
}
