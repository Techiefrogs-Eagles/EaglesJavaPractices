package Assignment1;

public class All_in_one {
    public static void main(String[] args) 
    {
        //    assignment.code1();     // addition of two integers
        //    assignment.code2();     //java program to compute quotient and remainder
        //    assignment.code3();     //swap two numbers
        //    assignment.code4();     //check whether a number is even or odd
        //    assignment.code5();     //check whether an alphabet is vowel or consonent
        //    assignment.code6();     //find th largest among three
        //    assignment.code7();     // check whether the given character is a alphabet
        //    assignment.code8_1();   //find the factorial of the number using for loop
        //    assignment.code8_2();   //find the factorial of the number using while loop
        //    assignment.code9_1();   //sum of n natural numbers using for loop
        //    assignment.code9_2();   //sum of n natural numbers using while loop
        //    assignment.code10();    //multiplication table
        //    assignment.code11();    //find the G.C.D of a given number
        //    assignment.code12();    //find the L.C.M of a given number
        //    assignment.code13();    //display charecters from a to z
        //    assignment.code14();    //check whether the number is prime or not
        //    assignment.code15();    //check the given number is palindrome
        //    assignment.code16();    //check the given number is armstrong number
        //    assignment.code17();    //program to print half pyramid using *
        //    assignment.code18();    //program to print half pyramid using numbers
        //    assignment.code19();    //program to print half pyramid using alphabets
        //    assignment.code20();    //program to print inverted half pyramid using *
        //    assignment.code21();    //program to print inverted half pyramid using numbers
        //    assignment.code22();    //program to print a full pyramid using *
        //    assignment.code23();    //program to print pyramid using numbers
        //    assignment.code24();    //program to print inverted full pyramid
        //    assignment.code25();    //print pascal's triangle
        //    assignment.code26();    //print floyd's triangle
        //    assignment.code27();    //print diamond shape pattern
        //    assignment.code28();    //print right pascal's triangle
        //    assignment.code29();    //print left pascal's triangle
        //    assignment.code30();    //print sand glass pattern

    }
        // addition of two integers
        static void code1()
        {
            int a=10;
            int b=20;
            int add=a+b;
            System.out.println("a+b = "+add);
        }
        
        //java program to compute quotient and remainder
        static void code2()
        {
            int a=10;
            int b=20;
            int divide=b/a;
            int remainder=b%a;
            System.out.println("a/b = "+divide);
            System.out.println("a%b = "+remainder);
        }

        //swap two numbers
        static void code3()
        {
            int a=10;
            int b=20;
            System.out.println("previous values of a = "+a+","+"b = "+b);
            int c = a;
            a = b;
            b = c;
            System.out.println("swapped values of a = "+a+","+"b = "+b);
        } 

        //check whether a number is even or odd
        static void code4()
        {
            int a=10;
            if (a%2==0) 
            System.out.println("The given number is even");
            else
            System.out.println("The given number is odd");
        }

        //check whether an alphabet is vowel or consonent
        static void code5()
        {
            char c = 'h';
            switch(c)
            {
                case 'a','e','i','o','u':
                System.out.println("The given alphabet is a vowel");
                break;
                default :
                System.out.println("The given alphabet is a consonent");
            }
        }

        //find th largest among three
        static void code6()
        {
            int a=10;
            int b=20;
            int c=30;
            if (a>b)
            {
                if (a>c)
                System.out.println("a is the largest");
            }
            else
            {
                if (b>c)
                System.out.println("b is the largest");
                else
                System.out.println("c is the largest");
            }
        }

        // check whether the given character is a alphabet
        static void code7()
        {
            char k = 'G';
            if ((k >= 'A' && k <= 'Z') || (k >= 'a' && k <= 'z'))
            System.out.println("The given charecter is a alphabet");
            else
            System.out.println("The given charecter is not a alphabet");
        }

        //find the factorial of the number using for loop
        static void code8_1()
        {
            int input=3;
            int j=1;
            for(int i=1;i<=input;i++)
            {
                j=j*i;
            }
            System.out.println(j);
        }

        //find the factorial of the number using while loop
        static void code8_2()
        {
            int input=5;
            int i=1;
            int j=1;
            while(i<=input)
            {
                j=j*i;
                i++;
            }
            System.out.println(j);
        }

        //sum of n natural numbers using for loop
        static void code9_1()
        {
            int input=3;
            int j=0;
            for(int i=1;i<=input;i++)
            {
                j=j+i;
            }
            System.out.println(j);
        }

        //sum of n natural numbers using while loop
        static void code9_2()
        {
            int input=6;
            int i=1;
            int j=0;
            while(i<=input)
            {
                j=j+i;
                i++;
            }
            System.out.println(j);
        }

        //multiplication table
        static void code10()
        {
            int i = 2;
            int j = 1;
            for(j=1;j<=10;j++)
            System.out.println(i+" * "+j+" = "+i*j);
        }

        //find the G.C.D of a given number
        static void code11()
        {
            int a=12;
            int b=18;
            int gcd=1;
            for(int i=1;i<=a && i<=b;i++)
            {
                if (a%i==0 && b%i==0)
                gcd=i;
            }
            System.out.println("G.C.D of given numbers is "+gcd);
        }

        //find the L.C.M of a given number
        static void code12()
        {
            int a=15;
            int b=25;
            int gcd=1;
            for(int i=1;i<=a && i<=b;i++)
            {
                if (a%i==0 && b%i==0)
                gcd=i;
            }
            int lcm=(a*b)/gcd;
            System.out.println("L.C.M of given numbers is "+lcm);
        }

        //display charecters from a to z
        static void code13()
        {
            for(char c = 'a';c <= 'z';c++)
            {
                System.out.print(c);
            }
            System.out.println();
            for(char c = 'A';c <= 'Z';c++)
            {
                System.out.print(c);
            }
            System.out.println();
        }

        //check whether the number is prime or not
        static void code14()
        {
            int input=3;
            int a= 0;
            int b=0;    
            a=input/2;      
            if(input==0||input==1)
            {  
                System.out.println(input+" is not prime number");      
            }
            else
            {  
                for(int i=2;i<=a;i++){      
                if(input%i==0){      
                System.out.println(input+" is not prime number");      
                b=1;      
                break;      
            }      
            if(b==0)  { System.out.println(input+" is prime number"); }  
            }  
          }    
            
        }

        //check the given number is palindrome
        static void code15()
        {
            int input = 121;
            int rem;
            int sum = 0;
            int ref;
            ref = input;           
            while(input>0)            
            {                         
                rem = input%10;
                sum = (sum*10)+rem;
                input = input/10;
            }
            if(ref==sum)
            {
            System.out.println("given number is a palindrome");
            }
            else
            {
            System.out.println("given number is not a palindrome");
            }
        }

        //check the given number is armstrong number
        static void code16()
        {
            int input = 152;
            int rem;
            int sum = 0;
            int ref;
            ref = input;
            while(input>0)
            {
                rem = input%10;
                sum = (rem*rem*rem)+sum;
                input = input/10;
            }
            if(ref==sum)
            {
            System.out.println("given number is a armstrong number");
            }
            else
            {
            System.out.println("given number is not a armstrong number");
            }
        }

        //program to print half pyramid using *
        static void code17()
        {
            int rows = 5;
            for (int i = 1;i<=rows;i++)
            {
                for (int j = 1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        //program to print half pyramid using numbers
        static void code18()
        {
            int rows = 5;
            for (int i = 1;i<=rows;i++)
            {
                for (int j = 1;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }

        //program to print half pyramid using alphabets
        static void code19()
        {
            for (char p ='A';p<='E';p++)
            {
                for (char b ='A';b <= p;b++)
                {
                    System.out.print(p+" ");
                }
                System.out.println();
            }
        }

        //program to print inverted half pyramid using *
        static void code20()
        {
            int rows = 5;
            for (int i = 1;i<=rows;i++)
            {
                for (int j = rows;j>=i;j--)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


        //program to print inverted half pyramid using numbers
        static void code21()
        {
            int rows = 5;
            for (int i = rows;i>=1;i--)
            {
                for (int j = 1;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();  
            }
        }

        //program to print a full pyramid using *
        static void code22()
        {
            int rows = 5;
            int till = rows+rows-1;
            int space = rows+rows-2;
            for (int i=1;i<=till;i++) 
            {
                if (i%2==0)
                continue;
                for (int k=1;k<=space;k++)
                {
                    System.out.print(" ");
                }
                for (int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
                space=space-2;
            }
        }

        //program to print pyramid using numbers
        static void code23()
        {
            
        }

        //program to print inverted full pyramid
        static void code24()
        {
            int rows = 10;
            int till = rows+(rows-1);
            int space = rows+rows-2;
            for (int i=1;i<=till;i++) 
            {
                if (i%2==0)
                continue;
                for (int k=till;k<=space;k++)
                {
                    System.out.print(" ");
                }
                for (int j=till;j>=i;j--)
                {
                    System.out.print("* ");
                }
                System.out.println();
                space=space+2;
            }
        }

        //print pascal's triangle
        static void code25()
        {
            
        }

        //print floyd's triangle
        static void code26()
        {
            int rows = 4;
            int input=rows;
            int till=0;
            for(int i=1;i<=input;i++) 
            {
                till=till+i;
            }
            int floyd = 1; 
            for (int i = 1;i<=rows;i++)
            {
                for (int j = 1;j<=i;j++)
                {
                    System.out.print(floyd+" ");
                    floyd = floyd+1;
                }
                System.out.println();
                
            }
            
        }

        //print diamond shape pattern
        static void code27()
        {
            int rows = 8;
            int till = rows+(rows-1);
            int space = rows-1;
            for (int i=1;i<=till;i++) 
            {
                if (i%2==0)
                continue;
                for (int k=1;k<=space;k++)
                {
                    System.out.print(" ");
                }
                for (int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
                space=space-1;
            }

            int rows0 = rows-1;
            int till0 = rows0+rows0-1;
            int space0 = rows0+rows0-1;
            for (int i=1;i<=till0;i++) 
            {
                if (i%2==0)
                continue;
                for (int k=till0;k<=space0;k++)
                {
                    System.out.print(" ");
                }
                for (int j=till0;j>=i;j--)
                {
                    System.out.print("*");
                }
                System.out.println();
                space0=space0+1;
            }
        }

        //print right pascal's triangle
        static void code28()
        {
            int rows = 5;
            for (int i = 1;i<=rows;i++)
            {
                for (int j = 1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

            int rows0 = rows-1;
            for (int i = 1;i<=rows0;i++)
            {
                for (int j = rows0;j>=i;j--)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        //print left pascal's triangle
        static void code29()
        {
            int rows = 10;
            int till = rows-1;
            int space = rows-1;
            for (int i=1;i<=till;i++) 
            {
               // if (i%2==0)
               // continue;
                for (int k=1;k<=space;k++)
                {
                    System.out.print(" ");
                }
                for (int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
                space=space-1;
            }

            int rows0 = rows-1;
            int till0 = rows0-1;
            int space0 = rows0;
            for (int i=1;i<=till0;i++) 
            {
               // if (i%2==0)
                //continue;
                for (int k=till0;k<=space0;k++)
                {
                    System.out.print(" ");
                }
                for (int j=till0;j>=i;j--)
                {
                    System.out.print("*");
                }
                System.out.println();
                space0=space0+1;
            }
        }

        //print sand glass pattern
        static void code30()
        {
            int rows = 5;
            int till = rows+(rows-1);
            int space = rows+rows-2;
            for (int i=1;i<=till;i++) 
            {
                if (i%2==0)
                continue;
                for (int k=till;k<=space;k++)
                {
                    System.out.print(" ");
                }
                for (int j=till;j>=i;j--)
                {
                    System.out.print("* ");
                }
                System.out.println();
                space=space+2;
            }
            
            space = rows+rows-2;
            for (int i=1;i<=till;i++) 
            {
                if (i%2==0)
                continue;
                for (int k=1;k<=space;k++)
                {
                    System.out.print(" ");
                }
                for (int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
                space=space-2;
            }
        }
    
}

