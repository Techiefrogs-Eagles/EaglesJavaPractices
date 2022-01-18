package Basicpractice;

public class Operatordemo1 {
    public static void main(String[] args) {
        // Bitwise & - AND) , Bitwise | - OR)

        int a = 10, b = 5;
        String S = "Bitwise & |";
        System.out.println(S);
        System.out.println(a>b & ++b>a); // true & false = false (both the condition has to true, only then it returns true in o/p)
        System.out.println (b); // even though the 2nd condition is false it executes the value for b in o/p along with false.
        System.out.println("integer Bitwise &");
        System.out.println(a & b); // Hexa decimal of 10 & 6 // 1010
                                                             // 0110
                                                            //----------
                                                             // 0010 = 2 is the decimal value

        System.out.println( b<=a | a--<b); // true | false = true //OR returns true if any one of the condition is true.
        System.out.println (a); // It returns the value of 'a' based on 2nd condition even tho 2nd contion is false.
        System.out.println (b); 
        System.out.println("Integer Bitwise OR |");
        System.out.println(a | b);// Hexa decimal of 9 & 6 // 1001
                                                           // 0110
                                                           //----------
                                                           // 1111 = 15 is the decimal value




        String S1 = "Logical && ||";
        System.out.println(S1);
                   
        // Logical AND - &&) and Logical OR - || (This logical (AND, OR) used only on condition, it cannot be used between integer.
        
        a = 20;
        b = 10;
        System.out.println( a<b && ++b<a);   // false && = false // if false, it doesnt chk 2nd condition
        System.out.println (b);  // it doesn't excute ++b value in o/p as the 1st condition is false
        System.out.println( a<b && b>++a);   // false && false = false 
        System.out.println(a); // if 1st condition is false, then it doesnt return a++ value on 2nd condition.

        System.out.println( a>b || ++b<--a);   // true || = true // if 1st condition is true, it doesn't chk 2nd condition
        System.out.println(b);
        System.out.println( b>a++ || a>b); // false || true = true
        System.out.println (a); // it doesn't excute a++ value in o/p as the 1st condition is false

        // Ternary operator
        // we use this one line command instead of IF else statement // it uses ? and :

        a = 2;
        b = 4;
        String S2 = "Ternary Operator";
        System.out.println(S2);
        System.out.println((a < b) ? a : b); // it checks if a<b is true, then it returns a else b
        System.out.println((a > b) ? a : b); // here a is not greater than b, so it executes b as a else statement

        // Assignment operator = 

        String S3 = "Assignment Operator";
        System.out.println(S3);

        a = 3;
        b = 6;
        int c = 1;

        a += 10; // a = a+10
        b -= 5;  // b = b-5
        c *= 5;  // c = c*5
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);  

        // comparision Operator
        // It compares two values. it always returns boolean value of  either true or false based on comparision
        // we used >,<,<=,>=,=, != in above pgm


    }
}
