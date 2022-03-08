package practice.Miscellaneous;
      
public class Coding 
{    
    public static void main(String[] args) 
    {
        int result = method(5,8,4);
        System.out.println(result);
    }
    static int method(int input1,int input2,int input3)
    {
        int d = input2-input1;
        int first = input1-d;
        int nthELEMNT = first+(d*(input3-1));
        return nthELEMNT;
    }
}