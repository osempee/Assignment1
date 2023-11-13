public class Continue {
    public static void main(String[] args) {
        System.out.println("Output");
        for(int count = 0; count < 10; count++){
            if (count == 5)
                continue;
            System.out.println("The value of y is: " + count);

        }
    }
}
