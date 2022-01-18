package Basicpractice;

public class Conditionalstatementdemo {
    public static void main(String[] args) {
        int WomenAge = 18;
        int MenAge = 21;
        // else if ladder
        
       if (WomenAge>18)
       {
           System.out.println("Eligible for to get married");
       }
       else if (MenAge>21 | WomenAge>18) {
           System.out.println("Eligible to get married");
       }
       else if (MenAge>=21 && WomenAge>=18) {
            System.out.println("Eligible to get married");
            System.out.println("Women age is greater than or equal to 18");
       }
       else {   
       System.out.println("Not Eligible to get married");
    }
}
       
}
