package homework;

import java.util.Scanner;

//Write a program to check if a given number is a palindrome.
public class HWQuestion18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,reversedNumber=0,remainder = 0;
        System.out.println("Enter the number : ");
        number = scanner.nextInt();
        int originalNumber = number;
        while(number!=0){
            remainder = number%10;
            reversedNumber = reversedNumber*10 + remainder;
            number= number/10;
        }
        if(originalNumber == reversedNumber){
            System.out.println("The given number is a palindrome.");
        }
        else{
            System.out.println("The given number is not a palindrome.");
        }
    }
}
