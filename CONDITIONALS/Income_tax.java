package CONDITIONALS;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Income_tax {
    public static void main(String[] args) {
        System.out.println("Enter your salary");
        Scanner s= new Scanner(System.in);
    
    int salary=s.nextInt();
    int tax;

    if(salary< 300000){
        System.out.println("You don't need to pay any tax");
        
    }
    else if(salary>300000 & salary<=600000){
        System.out.println("You need to pay 5% tax");
        tax=salary*5/100;
        System.out.println("Your payable tax is"+tax);
    }
    else if(salary>600000 & salary<=900000){
        System.out.println("You need to pay 10% tax");
        tax=salary*10/100;
        System.out.println("Your payable tax is"+tax);
    }
    else if(salary>900000 & salary<=1200000){
        System.out.println("You need to pay 15% tax");
        tax=salary*15/100;
        System.out.println("Your payable tax is"+tax);
    }
    else if(salary>1200000 & salary<=1500000){
        System.out.println("You need to pay 20% tax");
        tax=salary*20/100;
        System.out.println("Your payable tax is"+tax);
    }
    else{
        System.out.println("You need to pay 30% tax");
        tax=salary*30/100;
        System.out.println("Your payable tax is"+tax);
    }
        
    }
    

}
