package Basicpractice;

public class Operatordemo {

    public static void main(String[] args) {
        //unary operators (++ is icrement, -- is decrement, ~ is tilt, !)
        int a = 10, b =20;
        //++ = + 1 e.g. a++ => a = a + 1
        System.out.println(a++); // post fix icrement
        System.out.println(a); // here the a value becomes 11

        System.out.println(++b); //pre fix increment
        System.out.println(b); // b is 21
        //-- = - 1 e.g. a-- => a = a - 1
        System.out.println(a--); //post fix decrement//since value of a is already 11 in "line 7", now the output will be 11
        System.out.println(a); // so 11 -1 here

        System.out.println(--b); // pre fix decrement // b is 20
        System.out.println(b); // b is still 20

        System.out.println(a++ + ++a);
        System.out.println(--b + b--);
        
        System.out.println(a++ - ++a);
        System.out.println(--b - b--);

        // ~ bitwise compliment or negation

        int c = 8; // mostly when we use ~ for positive number, value increments by 1 and changes sign
        int d = -6; // for negative number, value decrements by 1 and changes sign
        System.out.println(~c); //  number to hexademimal, 8 => 1000 => 0111
        //System.out.println(c); // so here it prints only 8, it doesn't take ~c value
        System.out.println(~d); // number to hexadecimal => 6 => 0110 => 1001

        // ! inverse is used only on boolean

        boolean e = true;
        System.out.println(!e);

        // Arithmetic operators
        int h = 5, g = 2;
        System.out.println(h + g);
        System.out.println(h - g);
        System.out.println(h * g);
        System.out.println(h / g); //division - it gives the quotient
        System.out.println(h % g); //modulus - it gives a remainder

        // shift operator
        // left shift  formula is  n<<m = n*2^m
        System.out.println(10<<5); // n<<m = n*2^m = 10*2^5 = 320
        // right shift formula is n>>m = n/2^m
        System.out.println(10>>5); // n>>m = n/2^m = 10/2^5 = 0.31 = it displays 0 as it is the closest value


        
        
    }
}