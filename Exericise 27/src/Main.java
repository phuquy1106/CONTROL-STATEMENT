import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        a = sc.nextInt();

        if (a > 0) {
            System.out.println("Number is positive!");
        } else if (a < 0) {
            System.out.println("Number is negative!");
        } else {
            System.out.println("Number is zero!");
        }
    }
}