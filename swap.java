public class swap {
    public static void main(String[] args) {

        int myArr[]={5,7,9,4,8};
        ElementSwap(myArr, 2, 4);
        
    }

    public static void ElementSwap(int arr[], int first, int second){


        int temp=arr[first];
         arr[first]=arr[second];
         arr[second]=temp;

         for(int i:arr){
            System.out.print(i+" ");
         }
        
    }
}
