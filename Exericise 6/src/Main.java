import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input floating-point number: ");
        x = sc.nextDouble();
        System.out.println("Input floating-point another number: ");
        y = sc.nextDouble();

        x = Math.round(x*1000);
        x /=1000;
        x = Math.round(y*1000);
        y /=1000;

        if(x==y){
            System.out.println("They are the same up to three decimal places!");
        }else{
            System.out.println("They are different!");
        }
    }
}