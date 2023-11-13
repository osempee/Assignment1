import java.util.Arrays;
import java.util.Scanner;
//Write an array to store the first ten even number, print out all the number using forloop
public class EvenNumberExercise {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 1; i <= 10; i++){
            array[i-1]= i*2;
        }
        System.out.println(Arrays.toString(array));
    }
    }
