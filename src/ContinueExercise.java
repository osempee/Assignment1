public class ContinueExercise {
    public static void main(String[] args) {
        System.out.println("Output");
        for(int z = 1; z <= 25; z++){
            if (z%4 == 0)
                continue;
            System.out.println("The value of y is: " + z);
        }
    }
}
