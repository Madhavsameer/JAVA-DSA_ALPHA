package PRACTICE;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
       
        
        factorialFind();
        
        
    }

    public static void factorialFind(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number whose factorial you want");
        int num=sc.nextInt();

        if(num==0 || num==1){
            System.out.println("The factorial for Your number is 1");
            return;
        }
        if(num<0){
            System.out.println("Factorial for negative numbers is not defined");
            return;
        }
        int fact=1;
        for(int i=num; i>=1; i--){
           fact*=i;
        }
        System.out.println("The factorial for Your number is "+fact);
        return;

    }
}
