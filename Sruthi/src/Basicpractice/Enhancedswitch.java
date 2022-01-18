package Basicpractice;
// refer https://www.geeksforgeeks.org/enhancements-for-switch-statement-in-java-13/?ref=rp for more switch enhancement

public class Enhancedswitch {
    public static void main(String[] args) {
        int i = 5+10;
        int j = switch (i)    // switch can also use expression and declare like this   
        {
            case 5,10,15:
            System.out.println("It's milk chocolate"); // when similar processing is required for multiple case values, we can declare like this
            yield 5;

            case 20: 
            System.out.println("It's a dark chocolate");
            yield 20;

            default:
            System.out.println("It's a white chocolate");
            yield 0;    
        
        }; // If we use "yield" we have to use semi colon at the end of the closing brace
                  
        // Switch with arrows

        switch(j){
            case 5 -> System.out.println(" In 5 ");
            case 20 -> System.out.println(" In 20");
            default -> System.out.println(" return default vale");
        }
        System.out.println("my j value is "+j);
    }
}

