import java.util.Scanner;

public class Arrays {
    public static void main(String arg[]){
        System.out.println("Enter the Array size");
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=a.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                int temp=arr[i]*arr[i];
                System.out.println(temp);
            }
        }
    }
}
