import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int n;
       int sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        n = sc.nextInt();
        System.out.println("The first n natural numbers are : "+n);
        for (int i=1;i<=n;i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of Natural Number upto n terms : "+sum);
    }
}