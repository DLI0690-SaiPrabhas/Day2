import java.util.Scanner;

public class LogicalOperators {
    public static void main(String arg[]){
        System.out.println("Enter the year: ");
        Scanner sc=  new Scanner(System.in);
        int year=sc.nextInt();
        if(((year%4==0) && (year%100!=0))||year%400==0){

            System.out.println("Leap Year");
        }
        else
            System.out.println("Not a leap year");

        System.out.println("Enter a number to check divisible by 5 and 7");
        int p=sc.nextInt();
        if(p%5==0 && p%7==0)
            System.out.println("Divisible");
        else
            System.out.println("Not divisible");



    }
}
