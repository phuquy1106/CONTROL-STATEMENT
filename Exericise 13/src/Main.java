import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms : ");
        x = sc.nextInt();

        for (int i=1;i<=x;i++){
            System.out.println("Number is: "+i+" and cube of "+i+ " is : "+i*i*i);
        }
    }
}