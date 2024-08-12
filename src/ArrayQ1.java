import java.util.Arrays;
import java.util.Scanner;

public class ArrayQ1 {
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements: ");
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        float avg=sum/n;
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of array elements is: "+sum);
        System.out.println("Average of array elements: "+avg);

        System.out.println("Reverse array is: ");
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);

        }


        Arrays.sort(arr);
        System.out.println("Maximum value is: "+arr[n-1]);
        System.out.println("Minmum value is: "+arr[0]);

    }
}
