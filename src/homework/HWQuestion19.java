package homework;

import java.util.Scanner;

//Write a program to find the average of an array of numbers.
public class HWQuestion19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define the size of an array : ");
        int arraySize = scanner.nextInt();
        float numberArray[]= new float[arraySize];
        float sum = 0;
        System.out.println("Enter the elements in array : ");
        for (int i=0; i<arraySize; i++){
            numberArray[i] = scanner.nextInt();
            sum = sum + numberArray[i];
        }
        float average = sum/arraySize;
        System.out.println("The average of an array of given numbers is = " + average);
    }
}
