package homework;

import java.util.Scanner;

//Write a program to check if a string is a palindrome.
public class HWQuestion4 {
    private String checkString;

    public HWQuestion4(String checkString) {
        this.checkString = checkString;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to check whether it is a palindrome or not : ");
        String word= scanner.nextLine();
        HWQuestion4 homeWorkQuestion4 = new HWQuestion4(word);
        homeWorkQuestion4.checkPalindrome(word);
    }
    private void checkPalindrome(String word){
        String reverseWord = "";
        for(int i =0; i<word.length(); i++){
            reverseWord =word.charAt(i)+ reverseWord;
        }
        if(reverseWord.equals(word)){
            System.out.println("The given string is a palindrome.");
        }
        else{
            System.out.println("The given string is not a palindrome.");
        }
    }
}
