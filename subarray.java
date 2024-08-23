public class subarray {
    public static void main(String[] args) {
        int arr[]={5,4,9,3,7};

        for(int i=0; i<arr.length; i++){
           int j=arr.length-1;
           while(i<=j){
            System.out.print(arr[i]);
            i++;
           }
           System.out.println();

        
    }


}
}
