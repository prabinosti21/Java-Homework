package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program to find the largest element in an array.
public class HWQuestion5 {
    public static void main(String[] args) {
        List<Integer>numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number you want to check : ");
        int totalNumber = scanner.nextInt();
        for(int i=0; i<totalNumber; i++){
            System.out.println("Enter the numbers : ");
            int number = scanner.nextInt();
            numberList.add(number);
        }
        int largestNumber = numberList.stream().max(Integer::compare).get();
        System.out.println("-----------------------------------------------------");
        System.out.println("The largest number in the given list is : " + largestNumber);
    }
}
