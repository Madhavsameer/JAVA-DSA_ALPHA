package VARAIABLES_DATATYPES;

public class cube {
    

    public static void main(String[] args) {
        
        int a=4;
        int b=9;
        int sum=0;
        for(int i=a; i<=b; i++){
           int  cube=i*i*i;
           sum+=cube;
        }

        System.out.println(sum);
    }
}
