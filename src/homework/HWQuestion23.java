package homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Write a program to find the second-smallest element in an array.
public class HWQuestion23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int arraySize = scanner.nextInt();
        int numberArray[]= new int[arraySize];
        List<Integer>numberList = new ArrayList<>();
        System.out.println("Enter the elements in the array:");
        for(int i =0; i<arraySize; i++){
            numberArray[i] = scanner.nextInt();
            numberList.add(numberArray[i]);
        }
        numberList = numberList.stream().sorted().collect(Collectors.toList());
        System.out.println("The second smallest element in the given array is = " + numberList.get(1));
    }
}
