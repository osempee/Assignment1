package Week3;

public interface Shape1 {
    int getLength();
    int getBreadth();
    double area();


}

abstract class shape implements Shape1 {
    public int getBreadth() {
        return 0;
    }


    public double area() {
        return 0;
    }


    public int getLength() {
        return 0;
    }

}

