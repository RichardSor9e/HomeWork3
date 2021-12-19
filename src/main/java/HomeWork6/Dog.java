package HomeWork6;

public class Dog extends Animal {

    private int maxRunRange = 500;
    private int maxSwimRange = 10;

    public Dog(String name) { super(name);
    }


    public void run(int range) {

        if (range > maxRunRange) {
            System.out.println("Dog " + name + " has died because of you");
        } else
        System.out.println("Dog " + name + " has run " + range + "m");
    }
    public void swim(int range){
        if (range > maxSwimRange) {
            System.out.println("Dog " + name + " has died because of you");
        } else
        System.out.println("Dog " + name + " has swum " + range + "m");
    }
    }