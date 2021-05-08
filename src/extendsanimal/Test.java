package extendsanimal;



public class Test {

    public static void main(String[] args) {

        System.out.println("DOG:");

        Dog dog = new Dog("Барбос", "пёс");
        Dog dog1 = new Dog ("Грант", "дог");
        dog.run();
        dog1.swim();

        System.out.println();

        System.out.println("CAT:");

        Cat cat = new Cat("Барсик", "мейнкун");
        Cat cat1 = new Cat ("Мурзик", "сиамский кот");
        cat.run();
        cat1.swim();

       }
    }


