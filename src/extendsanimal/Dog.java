package extendsanimal;




public class Dog extends Animal {

    private final static int STOP_RUN = 500;
    private final static int STOP_SWIM = 10;


    public Dog(String name,  String type) {
        super(name,  type);

    }

    @Override
    public void run() {
              if (len.nextInt() - 1 <= STOP_RUN) {
                System.out.println(type + " " + name + " пробежал: " + len.nextInt((1)+550) + "м");;
            } else
                System.out.println(type + " " + name + " устал");

    }

    @Override
    public void swim() {
        if (distance.nextInt() - 1 <= STOP_SWIM) {
            System.out.println(type + " " + name + " проплыл " + distance.nextInt(10) + "м");
        } else
            System.out.println(type + " " + name + " устал");
    }
}
