package ClassesObjects;

public class Average {
    int n1;
    int n2;
    int n3;
    int average;

    Average(int num1,int num2,int num3)
    {
        this.n1 = num1;
        this.n2 = num2;
        this.n3 = num3;
    }
    void average1()
    {
        average = (this.n1+this.n2+this.n3)/3;
        System.out.println("The average of given three numbers is "+average);
    }

    public static void main(String[] args)
    {
        Average aver = new Average(2,2,2);
        aver.average1();
    } 
}
