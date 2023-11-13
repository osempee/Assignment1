package Assignment4;

public class Horse extends LivingThings implements Living{
    public Horse(int age, String name) {
        super(age, name);
    }

    @Override
    public void move() {
        System.out.println("Horse can move");

    }

    @Override
    public void eat(String eatingMethod) {
        System.out.println("Horse can eat");

    }
}
