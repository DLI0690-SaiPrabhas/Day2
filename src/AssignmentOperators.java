import java.util.Scanner;

public class AssignmentOperators {

    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition assingment: "+(a+=b));
        System.out.println("Subtraction assignment: "+(a-=b));
        System.out.println("Mul assignment: "+(a*=b));
        System.out.println("Division assignment: "+(a/=b));
        System.out.println("Remainder assinment: "+(a%=b));
    }
}
