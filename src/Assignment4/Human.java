package Assignment4;

public class Human extends LivingThings implements Living{
    public Human(int age, String name) {
        super(age, name);
    }

    @Override
    public void move() {
        System.out.println("Human can move");

    }

    @Override
    public void eat(String eating) {
        System.out.println("Human can eat" + " " + eating);

    }
}
