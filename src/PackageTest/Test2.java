package PackageTest;

import java.util.Scanner;

//Write a program that can reverse number, eg 12345=54321
public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is the reverse input");

        int num = input.nextInt();
        int reverse = 0;
        while(num != 0){
            reverse = (reverse * 10) + num %10;
            num = num / 10;

        }
        System.out.println(reverse);
    }

}
