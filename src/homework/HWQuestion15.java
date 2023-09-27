package homework;

import java.util.Scanner;

//Write a program to count the number of vowels and consonants in a string.
public class HWQuestion15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vowelCount=0, consonantCount = 0;
        System.out.println("Enter the string : ");
        String sentence = scanner.nextLine();
        String sentenceLowerCase = sentence.toLowerCase();
        String formattedSentence = sentenceLowerCase.replace(" ", "");
        for(int i =0; i< formattedSentence.length(); i++){
            if(formattedSentence.charAt(i) =='a' || formattedSentence.charAt(i) =='e' || formattedSentence.charAt(i) =='i'
                    || formattedSentence.charAt(i) =='o' || formattedSentence.charAt(i) =='u'){
                vowelCount ++;
            }
            else if (formattedSentence.charAt(i)>='a' || formattedSentence.charAt(i)<='z'){
                consonantCount ++;
            }
        }
        System.out.println();
        System.err.println("The total vowels in the given statement is = " + vowelCount);
        System.err.println("The total consonants in the given statement is = " + consonantCount);
    }
}
