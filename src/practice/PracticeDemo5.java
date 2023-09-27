package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are negative.
public class PracticeDemo5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=10, number;
        PracticeDemo5 practiceDemo5 = new PracticeDemo5();
        List<Integer>numberList= new ArrayList<>();
        System.out.println("Enter the numbers:");
        for(int i=0; i<count; i++){
            numberList.add(number= scanner.nextInt());
            practiceDemo5.checkException(number);
        }

    }
    public void checkException(int number){
        try{
            if(number<0){
                throw new InvalidNumberException("The given number is a negative number.");
            }
        } catch (InvalidNumberException e) {
            e.printStackTrace();
        }
    }
    public class InvalidNumberException extends Exception{
        public InvalidNumberException(String customExceptionMessage){
            super (customExceptionMessage);
        }
    }
}
