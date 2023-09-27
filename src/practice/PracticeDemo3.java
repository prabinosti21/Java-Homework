package practice;

//Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

import java.util.Scanner;

public class PracticeDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float number1= scanner.nextFloat();
        System.out.println("Enter the second number : ");
        float number2= scanner.nextFloat();
        /*if(number1*10 == number2*10){
            if(number1*10 ==number2*10){
                if(number1*10==number2*10){
                    System.out.println("Both number are same up-to three decimal places");
                }
            }
        }
        else {
            System.out.println("Both numbers are not equal up to three decimal places");
        }*/
        if(number1*1000 == number2*1000){
            System.out.println("Both number are same up-to three decimal places");
        }
        else {
            System.out.println("Both numbers are not equal up to three decimal places");
        }
    }
}
