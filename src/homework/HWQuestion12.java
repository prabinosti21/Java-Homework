package homework;

import java.util.Scanner;

//Write a program to count the number of words in a string.
public class HWQuestion12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter the string : ");
        String sentence = scanner.nextLine();
        for(int i=0; i<sentence.length(); i++){
            if((sentence.charAt(i) == ' ') && (sentence.charAt(i + 1) != ' ')){
                count ++;
            }
        }
        System.out.println();
        System.err.println("The total number of words in the given string is : " + count);
    }
}
