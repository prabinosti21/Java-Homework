package homework;

import java.util.Scanner;

//Write a program to find the Fibonacci series up to a given number.
public class HWQuestion7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count number to find out the fibonacci series :");
        int countNumber = scanner.nextInt();
        int num1, num2,num3;
        System.out.println("Enter the first number : ");
        num1 = scanner.nextInt();
        System.out.println("Enter the second number : ");
        num2 = scanner.nextInt();
        System.out.println("The Fibonacci series up-to given count number is : ");
        System.out.println("----------------------------------");
        System.out.print(num1 +" , " + num2 + " , ");
        for(int i = 0; i<countNumber; i++){
            num3 = num1 + num2;
            System.out.print(num3 + " , ");
            num1 = num2;
            num2 = num3;
        }
    }
}
