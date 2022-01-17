package Assignment1;

public class sumOfNnatural {
    public static void main(String[] args) 
    {
        sumOfNnatural.code9_1();   //sum of n natural numbers using for loop
        sumOfNnatural.code9_2();   //sum of n natural numbers using while loop
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
}
