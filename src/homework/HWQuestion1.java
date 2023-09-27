package homework;
//Write a program to check if a given number is prime.
import java.util.Scanner;

public class HWQuestion1 {
    private Integer number;
    public HWQuestion1(Integer number) {
        this.number = number;
    }
    public Integer getNumber() {return number;}
    public void setNumber(Integer number) {this.number = number;}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = scanner.nextInt();
        HWQuestion1 homeworkQuestion1 = new HWQuestion1(num1);
        homeworkQuestion1.checkNumber(num1);
    }
    private void checkNumber(int number) {
        int count =0;
        if (number == 1 || number == 0) {
            System.out.println("This is not a prime number.");
        } else if (number < 1) {
            System.out.println("This is not a prime number.");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number%i ==0){
                    count = count+1;
                }
            }
            if(count ==2){
                System.out.println("This is a prime number.");
            }
            else{
                System.out.println("This is not a prime number.");
            }
        }
    }
}
