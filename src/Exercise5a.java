import java.util.Scanner;

public class Exercise5a {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        int sumSeries = 0;
        int count = 1, arrayIndex = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Please enter a number");
            int num = scanner.nextInt();
            sumSeries += num;

            if( count%5 == 0){
                System.out.printf("Series %d total: %d\n", (count/5), sumSeries);
                numbers[arrayIndex++] = sumSeries;
                sumSeries = 0;
            }
            count++;
        } while( count <= 20);

        sumSeries = 0;
        for( int x : numbers ){
            sumSeries += x;
        }
        System.out.println("Total summation: " + sumSeries);

    }
}
