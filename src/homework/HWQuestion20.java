package homework;

import java.util.Scanner;
//Write a program to print the first N prime numbers.

public class HWQuestion20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        System.out.println();
        System.out.println("The first " + N + " prime numbers are:");
        int count = 0;
        int number = 2;

        while (count < N) {
            if (isPrime(number)) {
                System.out.print(number + " , ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
