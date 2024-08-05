package FLOWCHART_PSUDOCODE;

public class Maximum_Number {
    public static void main(String[] args) {
        
        int a=5,b=7, c=14;
        if(a>b){
            if(a>c){
                System.out.println(+a+" is largest number");
            }
            else{
                System.out.println(+c+" is largest number");
            }

        }
        else{
            if(b>c){
                System.out.println(+b+" is largest number");
            }

            else{
                System.out.println(+c+" is largest number");
            }
        }
    }

}
