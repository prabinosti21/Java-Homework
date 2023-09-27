package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Write a program to reverse the words in a sentence.
public class HWQuestion14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>stringList = new ArrayList<>();
        System.out.println("Enter the string : ");
        String word = scanner.nextLine();
        stringList.add(word);
        System.out.println();
        System.out.println("The reverse string is : ");
        System.out.println
                (stringList.stream().map(string -> new StringBuilder(string).reverse()).collect(Collectors.joining()));
    }
}
