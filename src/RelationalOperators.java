import java.util.Scanner;

public class RelationalOperators {
    public static void main(String arg[]){
        System.out.println("Enter three numbers: " );
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if((a>b)&&(a>c))
            System.out.println("The Maximum num is: "+a);
        else if((b>c)&&(b>a))
            System.out.println("The Maximum num is: "+b);
        else
            System.out.println("The Maximum num is: "+c);

        String s1=sc.nextLine();

        String s2=sc.nextLine();
        if(s1==s2){
            System.out.println("Strings are equal");

        }
        else {
            System.out.println("Not equal");
        }
    }
}
