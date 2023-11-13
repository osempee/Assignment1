import java.util.Scanner;
//Write an array to store 10 string and print out the 1 and 5 and last string
public class StringExercise {
    public static void main(String[] args) {
        String[] array = new String[10];
        String holder = "String";
        for(int x = 1; x <= 10; x++){
            array[x-1] = holder + x;
        }
        System.out.println(array[0]);
        System.out.println(array[4]);
        System.out.println(array[9]);
        System.out.println(array[10]);
    }

        ;

}
