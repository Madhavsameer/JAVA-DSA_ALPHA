public class BinarySearch {
    public static void main(String[] args) {
        int myarr[]={1,2,3,4,5,6};
        searchbinary(myarr, 4);
        
    }

    public static void searchbinary(int arr[], int target){
        int low=0;
        int high=arr.length-1;


        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==target){
                System.out.println("Element is present at index "+mid);
                return;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            if(arr[mid]>target){
                high=mid-1;
            }
        }
        System.out.println("Elemnet not found");

    }
}
