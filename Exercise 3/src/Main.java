import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        a = sc.nextInt();
        System.out.println("Input the 2st number: ");
        b = sc.nextInt();
        System.out.println("Input the 3st number: ");
        c = sc.nextInt();

        if(a>b&&a>c){
            System.out.println("The greatest: "+a);
        }else if(c>a&&c>b){
            System.out.println("The greatest: "+c);
        }else{
            System.out.println("The greatest: "+b);
        }
    }
}