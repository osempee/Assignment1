import java.util.Arrays;
//write an array to store integer from 1 to 15, sum up all the integer using forEach loop
public class Exercise2{
    public static void main(String[] args) {
        int[] array = new int[15];
        int sum = 0;
        for(int i = 1; i <= 15; i++){
            array[i-1]= 1;
        }
        for(int i: array){
            sum += i;

    }
        System.out.println(sum);
}
}
