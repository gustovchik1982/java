package extendsanimal;

import java.util.Random;


public class Dog extends Animal {

    private final static int STOP_RUN = 500;
    private final static int STOP_SWIM = 10;

    public Dog(String name,  String type) {
        super(name,  type);

    }

    @Override
    public void run() {
        if (len.nextInt() - 1 <= STOP_RUN) {
            super.run();
        } else
            System.out.println(type + " " + name + " устал");
    }

    @Override
    public void swim() {
        if (distance.nextInt() - 1 <= STOP_SWIM) {
            super.swim();
        } else
            System.out.println(type + " " + name + " устал");
    }
}
