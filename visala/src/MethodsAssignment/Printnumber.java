package src.MethodsAssignment;

public class Printnumber {
    int i;
    void PrintNum(int a)
    {
        i=a;
        System.out.println("value of i="+i);

    }
}


class Printnumber1 extends Printnumber
{
    int j;
    void PrintNum(int b)
    {
       j=b;
       super.PrintNum(10);
         System.out.println( "value of j="+j);
       
       }

    
        public static void main(String[] args) {
            
    
        Printnumber1 PN=new Printnumber1();
        
        PN.PrintNum(20);
        }
    }
