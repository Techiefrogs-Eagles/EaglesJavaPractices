package Assignment1;

public class InverseFullPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j = i; j < n; j++){ // by using < and not <= n,we reduce one column to get executed to acheive peak shape at bottom
                System.out.print(" * ");
            }
            for(int j = i; j <= n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        }

    }