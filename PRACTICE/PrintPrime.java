package PRACTICE;
public class PrintPrime {
    public static void main(String[] args) {
        primeprint(15, 115);

        
    }

    public static void primeprint(int min, int max){
        
        for(int i=min; i<=max; i++){
            if(i%2!=0){
                System.out.println(i);
                
            }
        }
        
    }
}
