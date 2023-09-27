package homework;

import java.util.Scanner;

//Write a program to find the number of digits in a given number.
public class HWQuestion17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int count = 0;
        while (number!=0){
            number = number/10;
            count++;
        }
        System.out.println();
        System.out.println("The total number of digits in the given number is = " + count);
    }
}
