package homework;

import java.util.Scanner;

//Write a program to reverse a string.
public class HWQuestion3 {
    private String sentence;

    public HWQuestion3(String sentence) {
        this.sentence = sentence;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String sentence = scanner.nextLine();
        HWQuestion3 homeWorkQuestion3 = new HWQuestion3(sentence);
        homeWorkQuestion3.reverseString(sentence);
    }
    private void reverseString(String sentence){
        String reverseSentence = "";
        for(int i =0; i<sentence.length(); i++){
            reverseSentence =sentence.charAt(i)+ reverseSentence;
        }

        System.out.println("The reverse of a given string is : " + reverseSentence);

    }
}
