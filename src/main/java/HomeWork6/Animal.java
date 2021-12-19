package HomeWork6;

public abstract class Animal {

    public static int getAnimalCount;
    public String name;

    public Animal(String name) {
        this.name = name;

        getAnimalCount++;
    }
    public Animal(){};

}
