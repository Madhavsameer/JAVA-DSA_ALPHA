package PRACTICE;
public class DecimalToBinary {
    public static void main(String[] args) {
        D2B(9);
        

    }

    public static void D2B(int num){
        while(num>0){
            int result=0;
            int pow=0;
            
            int remainder=num%2;
            result=result+remainder*(int)Math.pow(10, pow);
            System.out.print(result);
            pow++;
            num=num/2;


        }
    }
}
