package PATTERNS;

/**
 * AdvancedPattern
 */
public class AdvancedPattern {

    public static void main(String[] args) {

        hollowRectangle(5, 7);
        InvertedNumberPyramid(5);
        FloydTriangle(5);
        ZeroOneTriangle(5);
        Butterfly(5);
        SolidRhombus(5);
        HollowRhombus(5);
        DiamondPattern(5);
        


        

    }

    public static void hollowRectangle(int row, int column){
        System.out.println("Hollow Rectangle");

        for(int i=1; i<=row; i++){
            for(int j=1;j<=column; j++){
                if(i==1 || i==row || j==1 || j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void InvertedNumberPyramid(int n){

        System.out.println("Inverted Number Pyramid");
        for(int i=n; i>=1;i--){
            for(int j=1; j<=i; j++){

                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void FloydTriangle(int n){
        System.out.println("Floyd's Triangle");
        int number=1;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }

    public static void ZeroOneTriangle(int n){

        System.out.println("Zero One Triangle");
        
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n){
        System.out.println("Butterfly pattern");

        //1st half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }



            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();


        }

        //2nd half

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            



            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();


        }
    }

    public static void SolidRhombus(int n){
        System.out.println("Solid Rhombus pattern");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }

            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void HollowRhombus(int n){
        System.out.println("Hollow Rhombus pattern");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }

            for(int j=1; j<=n; j++){

                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    public static void DiamondPattern(int n) {

        System.out.println("Diamond pattern");
    
        // 1st half
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
        // 2nd half
        for (int i = n - 1; i >= 1; i--) {  // Start from n-1 to avoid repeating the middle line
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
    
}