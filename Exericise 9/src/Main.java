import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the year: ");
        year = sc.nextInt();

        if(year%4==0&&year%100!=0){
            System.out.println(year+ " is a leap year");
        }else if(year%400==0){
            System.out.println(year+ " is a leap year");
        }else{
            System.out.println(year+ " is a no profit year");
        }

    }
}