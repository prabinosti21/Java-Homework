package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Write a program to find the second-largest element in an array.
public class HWQuestion10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Float>numberList = new ArrayList<>();
        System.out.println("Enter the array size : ");
        int arraySize = scanner.nextInt();
        float numberArray[]= new float[arraySize];
        System.out.println("Enter the elements in array : ");
        for(int i=0; i<arraySize; i++){
            numberArray[i]= scanner.nextFloat();
            numberList.add(numberArray[i]);
        }
        numberList = numberList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("The second largest number in the given array is : " + numberList.get(1));
    }
}
