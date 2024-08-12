import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String s="";
        char ch;
        for(int i=0;i<a.length();i++){
            ch=a.charAt(i);
            s=ch+s;
        }
        System.out.println(s);
        if(s.equals(a))
            System.out.println("Palindrom");
        else
            System.out.println("Not a Palindrom");
    }
}
