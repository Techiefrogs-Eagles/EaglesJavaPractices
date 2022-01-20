package Basicpractice;

public class NestedForLoopdemo {
    public static void main(String[] args) {
        // Nested For Loop // similar like Nested if

        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
               System.out.println(i+ " "+j);
                            }
                    } 
// Nested For Loop  is used for creating pattern too
       for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                //System.out.print(i+" ");
               System.out.print("* "); // to create * pattern
            }
            System.out.println();
        } 
        
// Use of "break;" in "For Loop"

        for(int i =5; i>=1;i--){
            if(i==3)            //here it breaks out from loop when i==3 is met
            break;
            System.out.println(i); //refer to o/p for more clarity

        }

// Use of "continue;" in "For Loop"
        for(int i =5; i>=1;i--){
        if(i==3)                    //here it only skips the current iteration and continues to execute the rest
        continue;
        System.out.println(i);//refer to o/p for more clarity
        }
    }
}
   
