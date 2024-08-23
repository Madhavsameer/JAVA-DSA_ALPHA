package PRACTICE;
/**
 * primeornot
 */
public class primeornot {

    public static void main(String[] args) {

        int num=20;
        int mum=2;
        System.out.println(Math.sqrt(num));
        System.out.println(Math.pow(num, mum));
        
        

        
        System.out.println(primecheck(19));
        
    }

    public static boolean primecheck(int n){
        for(int i=2; i<n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}