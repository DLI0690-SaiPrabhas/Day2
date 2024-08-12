import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ArithmaticOperators {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The addition of two numbers is: "+(a+b));
        System.out.println("The subtraction of two numbers is: "+(a-b));

        System.out.println("Enter a number for Multiplication table: ");
        int c=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(c+" * "+i+" = "+c*i);
        }
        int sum=0;
        System.out.println("Enter five numbers to find out the avg");
        for(int i=0;i<5;i++){
            int d=sc.nextInt();
            sum+=d;


        }
        int res=sum/5;
        System.out.println("The avg of 5 numbers is: "+res);

        final double e=3.14;
        System.out.println("Enter radius: ");
        int r=sc.nextInt();
        System.out.printf("Circle area: %.2f ",(e*r*r));
        System.out.println();
        System.out.println("Circumference of the circle is: "+(2*e*r));
    }

}
