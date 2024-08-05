package FLOWCHART_PSUDOCODE;

public class Sum_Of_N_Numbers {
    public static void main(String[] args) {
        
        int num=10;
        int min=1;
        int sum=0;

        while(min<=num){
            sum+=min;
            min++;
        }
        System.out.println("The sum of numbers is "+sum);
    }
}
