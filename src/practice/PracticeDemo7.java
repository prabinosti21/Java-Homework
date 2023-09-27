package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.
public class PracticeDemo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>numberList = new ArrayList<>();
        int count, number;
        System.out.println("Enter the count of numbers :");
        count = scanner.nextInt();
        System.out.println("Enter the numbers in the list : ");
        for(int i =0; i<count; i++){
            number = scanner.nextInt();
            numberList.add(number);
        }
        PracticeDemo7 practiceDemo7 = new PracticeDemo7();
        practiceDemo7.checkNumbers(numberList);
    }
    public void checkNumbers(List<Integer>numberList){
        try{
            for(int i=0; i<numberList.size(); i++){
                for(int j=i+1; j<numberList.size(); j++){
                    if(numberList.get(i) == numberList.get(j)){
                        throw new DuplicateNumberException("This duplicate element in the list is = " + numberList
                                .get(i));
                    }
                }
            }
        }catch (DuplicateNumberException e){
            e.printStackTrace();
        }finally {
            System.out.println("The list of the given numbers are : " + numberList);
        }
    }

    public class DuplicateNumberException extends Exception{
        public DuplicateNumberException(String customErrorMessage){
            super(customErrorMessage);
        }
    }

}
