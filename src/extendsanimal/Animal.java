package extendsanimal;

import java.util.Random;

public class Animal {

    protected final String name;
    protected final String type;
    protected final Random len = new Random();
    protected final Random distance = new Random();


    public Animal(String name, String type) {
        this.name = name;
        this.type = type;

    }

    public void run() {
        System.out.println(type + " " + name + " пробежал: " + len.nextInt((1)+550) + "м");
    }

    public void swim() {
        System.out.println(type + " " + name + " проплыл " + distance.nextInt(10) + "м");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

}