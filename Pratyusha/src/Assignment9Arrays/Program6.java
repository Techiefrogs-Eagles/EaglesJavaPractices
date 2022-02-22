package Assignment9Arrays;

public class Program6 
{
public static void main(String[] args) 
{
    char array[] = {'z','y','x','w'};
    int length = array.length;
    char[] ref = new char[length];
    int temp = 0;
    for (int i = length-1; i >=0; i--) 
    {
        ref[temp] = array[i];
        temp++; 
    }
    array = ref;
    for (char c : array) {
        System.out.print(c+" ");
    }
    
}
}
    

