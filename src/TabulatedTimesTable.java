import PackageTest.Test1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TabulatedTimesTable {


    public static void main(String[] args){

        System.out.print("This is a well structured multiplication table");
        System.out.print("\nEnter the number you want to print");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("==========================");

        int count = 1;
        while(count < 13){
            System.out.printf("%d \t X \t %d \t = \t%d \n", number, count, (number * count));
            System.out.println(number + " " + "\t" + " " + "X" + "  " + "\t" + " " + count + " " + "\t" + " " +  "="  + " " + (number * count) + " " + "\n");
            count++; //increment by 1
        }
    }
}
