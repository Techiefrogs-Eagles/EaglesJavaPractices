package src.MethodsAssignment;

public class Program2 {
    
}
class Print
{
    public static void main(String[] args) {

        

        Print obj = new Print();

        obj.Printn(1, 'J');

        obj.Printn('A', 2);

    }

    void Printn(int a , char c){  

        System.out.println("Integer  "+a + "   Char "+c);

    }    

     void Printn(char c,int a ){

        

        System.out.println("Char  "+c+ "    Integer  "+a );

    }   

}