import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int a;
     int b;
     int c;
     int d;
     int e;
     int sum=0;
     double avg = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 1: ");
        a = sc.nextInt();
        System.out.println("Input number 2: ");
        b = sc.nextInt();
        System.out.println("Input number 3: ");
        c = sc.nextInt();
        System.out.println("Input number 4: ");
        d = sc.nextInt();
        System.out.println("Input number 5: ");
        e = sc.nextInt();

        sum = (a+b+c+d+e);
        avg = sum/5;

        System.out.println("The sum of 5 no is : "+sum );
        System.out.println("The Average is : "+avg);
    }
}