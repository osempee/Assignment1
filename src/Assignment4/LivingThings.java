package Assignment4;

public abstract class LivingThings {
    private int Age;
    private String Name;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LivingThings(int age, String name) {
        Age = age;
        Name = name;
    }
    public void sleep(){
        System.out.println("");
    }
    public void speak(){
        System.out.println("I am shouting");
    }

}
