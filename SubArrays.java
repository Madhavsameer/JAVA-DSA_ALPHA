/**
 * SubArrays
 */
public class SubArrays {

    public static void main(String[] args) {
        int sum = 0;
        int ts=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        
        
        int arr[]={5,7,6,2,9,3};
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                    if(sum>maxsum){
                        maxsum=sum;
                    }
                    if(sum<minsum){
                        minsum=sum;
                    }
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println("Number of subarrays "+ts);
            System.out.println("Sum of total element is "+sum);
            System.out.println("Maximum sum is "+maxsum);
            System.out.println("Minimum sum is"+minsum);
    }
}