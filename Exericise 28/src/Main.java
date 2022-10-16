import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        x = sc.nextDouble();

        if (x > 0) {
            if (x < 1) {
                System.out.println("Input value: " + x);
                System.out.println("Positive small number");
            }
            if (x > 1000000) {
                System.out.println("Input value: " + x);
                System.out.println("Positive large number");
            } else {
                System.out.println("Input value: " + x);
                System.out.println("Positive number");
            }
        } else if (x < 0) {
            if (Math.abs(x) < 1) {
                System.out.println("Input value: " + x);
                System.out.println("Negative small number");
            }
            if (Math.abs(x) > 1000000) {
                System.out.println("Input value: " + x);
                System.out.println("Negative large number");
            } else {
                System.out.println("Input value: " + x);
                System.out.println("Negative number");
            }
        } else {
            System.out.println("Input value: " + x);
            System.out.println("Number is zero");
        }
    }
}