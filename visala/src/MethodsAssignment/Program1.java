package src.MethodsAssignment;

public class Program1
{
}

class PrintNumber {
    int print(int a){
        System.out.println(a);
        return a;
    }
      float print(float b){
         System.out.println(b);
        return b;
    }
      double print(double c){
           System.out.println(c);
        return c;
       
    }
       String print(String d){
           System.out.println(d);
        return d;
    }

public static void main(String[] args) {
      
PrintNumber a = new PrintNumber ();
a.print(10);
a.print(10.33);
a.print(0.2221);
a.print("hello");
}
void PrintNum(int i) {
}
}
