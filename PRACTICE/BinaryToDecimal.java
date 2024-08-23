package PRACTICE;


public class BinaryToDecimal {
    public static void main(String[] args) {

        System.out.println(B2D(1001));
        
    }

    public static int B2D(int binary){
        int decimal=0;
        int power=0;
        while(binary>0){
            int unit=binary%10;
            decimal=decimal+unit*(int)Math.pow(2, power);
           binary= binary/10;
            power++;
        }



        return decimal;
        


       
    }
}
