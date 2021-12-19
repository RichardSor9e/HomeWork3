package HomeWork6;

public class Cat extends Animal {

    private int maxRunRange = 200;
    private int maxSwimRange = 0;

    public Cat(String name) {super(name);
    }

    public void run(int range) {

        if (range > maxRunRange || range <= 0) {
            System.out.println("Cat " + name +  " has died because of you");
        }
        else System.out.println("Cat " + name + " has run " + range + "m");
    }
    public void swim(int range){
        if (range > maxSwimRange) {
            System.out.println("Cat " + name + " has died because of you");
        }
        else System.out.println("Cat " + name + " has swum " + range + "m");
    }
}
