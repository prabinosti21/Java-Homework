package homework;

import java.util.Scanner;

//Write a program to find the sum of digits in a given number.
public class HWQuestion25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int sum = 0;
        while(number!=0){
            sum = number%10 + sum;
            number = number/10;
        }
        System.out.println();
        System.out.println("The total sum of digits of the given number is = " + sum);
    }
}
