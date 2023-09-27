package homework;

import java.util.*;
//Write a program to find the maximum occurring character in a string.

public class HWQuestion13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scanner.nextLine();
        str = str.replace(" ", "");
        char maxChar = getMaxOccurringChar(str);
        System.out.println("The maximum occurring character in the string is: " + maxChar);
    }
    public static char getMaxOccurringChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }
        // Find the character with the maximum frequency
        char maxChar = ' ';
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        return maxChar;
    }
}