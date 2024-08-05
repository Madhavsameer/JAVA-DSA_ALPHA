package FLOWCHART_PSUDOCODE;

public class Prime_Or_Not {
    public static void main(String[] args) {

        int num=17;

        int var=2;
        while(var<num-1){
            if(num%var==0){
                System.out.println("This number is a non prime number");
                return;
                
            }
            else{
                var++;
            }
        }
        System.out.println("The given number is a prime number");
        


    }
}
