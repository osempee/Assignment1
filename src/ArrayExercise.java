import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise {

        public static int[] readInteger(){
                Scanner scanner = new Scanner(System.in);
                int[]intArray = new int[5];
                for( int i = 0; i < 5; i++){
                        System.out.println("Enter an input");
                        int entered = scanner.nextInt();
                        intArray[i] =entered;
                }
                return intArray;


        }
        public static String[] readString(){
                Scanner scanner = new Scanner(System.in);
                String[] stringArray = new String[5];
                for( int i = 0; i < 5; i++ ){
                        System.out.println("Enter an input: ");
                        String entered = scanner.nextLine();
                        stringArray[i] = entered;
                }
                return stringArray;
        }


}
class ArrayTest{
        public static void main(String[] args) {
                int[] collectedInput = ArrayExercise.readInteger();
                System.out.println(Arrays.toString(collectedInput));
                String[] collectedString = ArrayExercise.readString();
                System.out.println(Arrays.toString(collectedString));
        }
}
