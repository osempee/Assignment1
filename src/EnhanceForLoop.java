public class EnhanceForLoop {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int x: intArray){
            if (x > 7)
                System.out.println(x);
        }
    }
}
