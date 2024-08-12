import java.util.Scanner;

public class TernaryOperator {
    public static void main(String arg[]){

        int a=10,b=15;
        int c=(a<b)?a:b;
        System.out.println("Minimum num is: "+c);

        System.out.println("Enter Marks out of 100: ");
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        if(d>34)
            System.out.println("Pass");
        else System.out.println("Fail");

    }
}
