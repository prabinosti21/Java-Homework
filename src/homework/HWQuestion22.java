package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program to check if a number is positive, negative, or zero
public class HWQuestion22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double number = scanner.nextDouble();
        List<Double>numberList = new ArrayList<>();
        numberList.add(number);
        boolean zero = numberList.stream().allMatch(n->n==0);
        boolean positive = numberList.stream().allMatch(n->n>0);
        boolean negative = numberList.stream().allMatch(n->n<0);
        if(zero == true){
            System.out.println("The given number is a zero.");
        }
        else if(positive == true){
            System.out.println("The given number is a positive number.");
        }
        else if(negative == true){
            System.out.println("The given number is a negative number.");
        }
    }
}
