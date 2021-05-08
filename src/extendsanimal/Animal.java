package extendsanimal;


import java.util.Random;

public abstract class Animal {

    protected final String name;
    protected final String type;
    protected final Random len = new Random();
    protected final Random distance = new Random();



    public Animal(String name, String type) {
        this.name = name;
        this.type = type;

    }

    public abstract void run();
    public abstract void swim();

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

}