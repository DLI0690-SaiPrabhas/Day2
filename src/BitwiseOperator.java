import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String arg[]){

        boolean a=true;
        boolean b=false;
        System.out.println("And operator: "+(a&&b));
        System.out.println("Or Operator: "+(a||b));
        System.out.println("Xor Operator: "+(a^b));

        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        if(((c^1)==(c+1))){
            System.out.println("Even");

        }
        else
            System.out.println("Odd");


    }
}
