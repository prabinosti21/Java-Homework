package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program to find the sum of all elements in an array.
public class HWQuestion9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>numberList = new ArrayList<>();
        System.out.println("Enter the size of an array : ");
        int arraySize = scanner.nextInt();
        int numberArray[]= new int[arraySize];
        System.out.println("Enter the element in the array: ");
        for(int i =0; i<arraySize; i++){
            numberArray[i] = scanner.nextInt();
            numberList.add(numberArray[i]);
        }
        int totalSum = numberList.stream().mapToInt(n->n).sum();
        System.out.println();
        System.out.println("The total sum of numbers in the array is : " + totalSum);
    }
}
