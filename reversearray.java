public class reversearray {
    public static void main(String[] args) {
        

        int arr[]={18,15,16,14,26,23,17};

        int first=0;
        int last=arr.length-1;

        while(first<=last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
           
        }

        for(int i:arr){
            System.out.println(i);
        }
    }
}
