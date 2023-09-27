package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Write a program to count the number of occurrences of a character in a string.
public class HWQuestion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String word = scanner.nextLine();
        Map<Character,Integer>characterCount = new HashMap<>();
        for(Character ch : word.toCharArray()){
            if(characterCount.containsKey(ch)){
                characterCount.put(ch,characterCount.get(ch)+1);
            }
            else {
                characterCount.put(ch,1);
            }
        }
        for(Map.Entry loop: characterCount.entrySet()){
            System.out.println(loop.getKey() + " : " + loop.getValue());
        }
    }
}
