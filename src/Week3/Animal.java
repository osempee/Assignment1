package Week3;

public class Animal extends Organism{
    private int numberOfLegs;

    public Animal(String name, int numberOfLegs) {
        super(name);
        this.numberOfLegs = numberOfLegs;
    }

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public static int animalCount = 0;
}
