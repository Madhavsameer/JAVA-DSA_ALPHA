/**
 * trickyprogram
 */
public class trickyprogram {

    public static void main(String[] args) {
        
        answer("a1b6");
    }

    public static void answer(String str){
        for(int i=0; i<str.length()-1; i+=2){
            char ch= str.charAt(i);
            
            int times=Character.getNumericValue(str.charAt(i+1));
            for(int j=0; j<=times; j++){
                System.out.print(ch);
            }


        }
    }
}