package Inheritance;

import Inheritance.Dog;

import javax.print.DocFlavor;

public class Cat extends Dog {
    private String food;

    public Cat(String name, int age, String food) {
        super(name, age);
        this.food = food;
    }

    public void speak() {
        System.out.println("Meow, my name is " + this.name + " and I am eating a " + this.food);
    }

}

