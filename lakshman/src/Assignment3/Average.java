package Assignment3;

public class Average
{
    int num1;
    int num2;
    int num3;
    int average;

    Average(int num1,int num2,int num3)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    void average1()
    {
        average = (this.num1+this.num2+this.num3)/3;
        System.out.println("The average of given three numbers is "+average);
    }

    public static void main(String[] args)
    {
        Average averageOfThreeNums = new Average(5,15,25);
        averageOfThreeNums.average1();
    }
}
