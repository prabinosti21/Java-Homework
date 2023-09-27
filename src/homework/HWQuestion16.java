package homework;

import java.util.ArrayList;
import java.util.List;

//Write a program to find the sum of all even numbers between 1 and 100.
public class HWQuestion16 {
    public static void main(String[] args) {
        List<Integer>numberlist = new ArrayList<>();
        for(int i=1; i<=100; i++){
            numberlist.add(i);
        }
        int evenSum = numberlist.stream().filter(num-> num % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("The sum of even numbers between 1 to 100 is = " + evenSum);
    }
}
