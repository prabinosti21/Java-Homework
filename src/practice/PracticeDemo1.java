package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PracticeDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>numberList = new ArrayList<>();
        List<Integer>revisedList = new ArrayList<>();
        for(int i=0; i<3; i++) {
            System.out.println("Enter the numbers : ");
            int numbers = scanner.nextInt();
            numberList.add(numbers);
        }
        revisedList = numberList.stream().sorted().collect(Collectors.toList());
        System.out.println("The greatest numbers among the three input is = " + revisedList.get(2));
    }
}
