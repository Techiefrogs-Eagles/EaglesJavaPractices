package Assignment5;

public class program7 
{
    int i;
    void printNum(int a ){
        i = a;
        System.out.println("i value = "+i);}
}

class two extends program7
{
    int j;
    void printNum(int a){ 
        j = a;
        super.printNum(30);
        System.out.println("j value = "+j);
    }

    public static void main(String[] args) {
        two obj = new two();
        obj.printNum(20);
    }
}
