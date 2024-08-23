package PATTERNS;

public class BasicPatterns {
    

    public static void main(String[] args) {
        Square(5);
        Rectangle(3, 4);
        RightPyramid(5);
        RightInvertedPyramid(5);
        LeftPyramid(5);
        LeftInvertedPyramid(5);
        FullPyramid(5);
        
        
    }

    public static void Square(int n){
        System.out.println("Square shape");
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n; j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }

    public static void Rectangle(int row, int column){
        System.out.println("Rectangle shape");
        for(int i=1; i<=row; i++){
            for(int j=1; j<=column; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void RightPyramid(int n){
        System.out.println("Right pyramid shape");
        for(int i=1; i<=n; i++){

            
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void RightInvertedPyramid(int n){
        System.out.println("Right Inverted shape");
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void LeftPyramid(int n){
        System.out.println("Left pyramid shape");
        for(int i=1; i<=n; i++){

            for(int k=1; k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void LeftInvertedPyramid(int n){
        System.out.println("Left Inverted pyramid shape");
        for(int i=n; i>=1; i--){

            for(int k=1; k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void FullPyramid(int n){
        System.out.println("Full pyramid");
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
