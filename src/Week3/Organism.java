package Week3;

public class Organism {
    private String name;
    private static int organismCount = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organism(String name) {
        this.name = name;
    }
    public Organism(){
        organismCount++;
    }
}
