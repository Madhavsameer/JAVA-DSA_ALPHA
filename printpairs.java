public class printpairs {
    public static void main(String[] args) {

        int myArr[]={5,7,8,6,2};
        pairs(myArr);


        
    }

    public static void pairs(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
            
        }
        System.out.println("Total no. of pairs "+tp);

    }
}
