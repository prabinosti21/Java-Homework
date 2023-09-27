package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Write a program to remove duplicate elements from an array.
public class HWQuestion11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Float> numberList = new ArrayList<>();
        System.out.println("Enter the size of an array : ");
        int arraySize = scanner.nextInt();
        float numberArray[] = new float[arraySize];
        System.out.println("Enter the elements in the array : ");
        for(int i=0; i<arraySize; i++){
            numberArray[i]= scanner.nextFloat();
            numberList.add(numberArray[i]);
        }
        numberList = numberList.stream().distinct().collect(Collectors.toList());
        System.out.println("The array after removing duplicate elements is: " + numberList);
    }
}
