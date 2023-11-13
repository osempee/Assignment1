package PackageTest;

import java.util.Scanner;

//Write a Java program to get a number from the user and print whether it is positive or negative.
public class Test3 {
    public static void main(String[] args) {
        Scanner input =  new  Scanner(System.in);
        System.out.println("Print this");
        int x = input.nextInt();
        if(x > 0){
            System.out.println("Positive");
        }else if(x < 0){
            System.out.println("Negative");
        }else{
            System.out.println("print zero");
        }



    }

}
