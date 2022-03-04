package practice.Threads;

public class RunTimeDemo
{
    public static void main(String[] args) throws Exception
    {
        //Runtime.getRuntime().exec("notepad");
        Runtime obj = Runtime.getRuntime();
        System.out.println(obj.totalMemory());
        System.out.println(obj.freeMemory());
        for (int i = 0; i < 10000; i++) {
            new RunTimeDemo();
        }
        System.out.println(obj.freeMemory());
        System.gc();
        System.out.println(obj.freeMemory());
    }
}
