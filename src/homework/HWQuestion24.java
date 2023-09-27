package homework;

import java.util.Scanner;

//Write a program to find the number of occurrences of a word in a sentence.
public class HWQuestion24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to count: ");
        String word = scanner.next();
        int count = countOccurrences(sentence, word);
        System.out.println("The word \"" + word + "\" appears " + count + " time(s) in the sentence.");
    }
    public static int countOccurrences(String sentence, String word) {
        String[] words = sentence.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
}
