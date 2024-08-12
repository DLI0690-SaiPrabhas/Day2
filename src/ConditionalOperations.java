public class ConditionalOperations {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,1,2,-2,-4};
        int evencount=0,oddcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                evencount+=1;
            else
                oddcount+=1;
        }
        System.out.println(evencount+" even numbers and "+oddcount+" odd numbers in the array");
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
                System.out.println("Positive elements are: "+arr[i]);
            else if(arr[i]<0)
                System.out.println("Negative elements are: "+arr[i]);
            else
                System.out.println("Zero element: "+arr[i]);

        }


    }

}
