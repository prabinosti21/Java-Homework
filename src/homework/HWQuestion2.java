package homework;
//Write a program to calculate the factorial of a number.
import java.util.Scanner;

public class HWQuestion2 {
    private int number2;

    public HWQuestion2(int number2) {
        this.number2 = number2;
    }
    public int getNumber2() {return number2;}

    public void setNumber2(int number2) {this.number2 = number2;}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find out its factorial : ");
        int n = scanner.nextInt();
        HWQuestion2 homeWorkQuestion2 = new HWQuestion2(n);
        homeWorkQuestion2.calculateFactorial(n);
    }
    private void calculateFactorial(int num) {
        int result = 1;
        for (int i = 1; i <=num; i++) {
            result = i*result;
        }
        System.out.println("The factorial of the given number is : " + result);
    }
}
