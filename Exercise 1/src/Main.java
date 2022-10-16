import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x: ");
        x = sc.nextInt();
        if(x>0){
            System.out.println("Number is positive!");
        }else if(x<0){
            System.out.println("Number is negative!");
        }else{
            System.out.println("Number is zero");
        }
    }
}