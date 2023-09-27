package homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Write a program to find the third-largest element in an array.
public class HWQuestion26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int arraySize = scanner.nextInt();
        float numberArray[] = new float[arraySize];
        List<Float>numberList = new ArrayList<>();
        System.out.println("Enter the elements in array : ");
        for(int i=0; i<arraySize; i++){
            numberArray[i] = scanner.nextInt();
            numberList.add(numberArray[i]);
        }
        numberList = numberList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println();
        System.out.println("The third-largest element in an array is = " + numberList.get(2));
    }
}
