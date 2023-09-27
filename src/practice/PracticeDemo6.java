package practice;

import java.util.Scanner;

//Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
public class PracticeDemo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String word = scanner.nextLine();
        PracticeDemo6 practiceDemo6 = new PracticeDemo6();
        practiceDemo6.check(word);
    }
    public void check(String word){
            try {
                word = word.toLowerCase();
                if (word.contains("a") || word.contains("e") || word.contains("i")
                        || word.contains("o") || word.contains("u")) {
                    System.out.println("The words contains vowel letters.");
                } else {
                    throw new NotVowelException("The words doesn't contains a vowels letter");
                }
            }catch (NotVowelException e){
                e.printStackTrace();
            }
    }
    public class NotVowelException extends Exception{
        public NotVowelException (String customExceptionMessage){
            super (customExceptionMessage);
        }
    }
}
