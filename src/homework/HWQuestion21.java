package homework;

import java.util.Scanner;

//Write a program to reverse a number.
public class HWQuestion21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,reversedNumber=0,remainder = 0;
        System.out.println("Enter the number : ");
        number = scanner.nextInt();
        while(number!=0){
            remainder = number%10;
            reversedNumber = reversedNumber*10 + remainder;
            number= number/10;
        }
        System.out.println("The reversed number is = " + reversedNumber);
    }
}
