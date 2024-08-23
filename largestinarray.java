/**
 * largestinarray
 */
public class largestinarray {

    public static void main(String[] args) {
        int arr[]={18,15,16,14,26,23,17};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>largest){
                largest=arr[i];
                System.out.println("Largest element is "+largest+"founded at "+i+"ndex");
                System.out.println();
            }

            System.out.println();

        }
    }
}