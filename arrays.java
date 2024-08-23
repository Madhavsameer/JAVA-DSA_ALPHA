import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] myArray = {1,3,2,3,4};
        int result=sumofUnique(myArray);
        System.out.println(result);
    }

    public static int sumofUnique(int arr[]){
        Arrays.sort(arr);
        int sum = arr[0];
        for (int i =1 ; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                continue;
            }
            else{
                sum+=arr[i];
            }
        }



        return sum;

    }
}
