import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terns is: ");
        n = sc.nextInt();

        for (int i = 1; i<=n;i++){
            System.out.println(i*2-1);
            sum +=i*2-1;
        }
        System.out.println("The Sum of add Natural Number upto "+n+" terms is: "+sum);

    }
}