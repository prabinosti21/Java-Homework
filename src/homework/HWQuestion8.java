package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program to calculate the average of a list of numbers.
public class HWQuestion8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        System.out.println("Enter the total count of numbers you wanna put in the list : ");
        int count = scanner.nextInt();
        System.out.println("Enter the number in list :");
        for(int i=0; i<count; i++){
            int number=scanner.nextInt();
            numberList.add(number);
        }
        double average = numberList.stream().mapToInt(n->n).average().orElse(0);
        System.out.println("The average of the given list of the numbers is : " + average);
    }
}
