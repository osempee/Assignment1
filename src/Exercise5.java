import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int count = 1;
        int fiveSeries = 0, total = 0;
        int[] numbers = new int [4];
        int arrayIndex = 0;

        Scanner scanner = new Scanner(System.in);
        do{
            for(int i = 0; i < 5; i++){
                int entered = scanner.nextInt();
                fiveSeries += entered;
            }
            System.out.println("Series 1 Total:" + fiveSeries);
            numbers[arrayIndex++] = fiveSeries;
            fiveSeries = 0;
            count++;

        }while(count <=4);
        Scanner close;
        for(int x : numbers){
            total += x;
        }
        System.out.println("Total summation: " + total);
    }
}
