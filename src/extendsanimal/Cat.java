package extendsanimal;



public class Cat extends Animal {

    private final static int STOP_RUN = 200;

    public Cat  (String name, String type){
        super (name, type);
    }

    @Override
    public void run() {
        if (len.nextInt() < STOP_RUN) {
            super.run();
        }else
            System.out.println(type + " " + name + " устал");
    }

    @Override
    public void swim() {
        System.out.println("Коты не плавают");
    }

}
