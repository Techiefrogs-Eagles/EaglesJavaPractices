package src.Practice1.Multithread;

public class Runtime1 {
    public static void main(String[] args) throws Exception
    {
        //Runtime.getRuntime().exec("notepad");
        Runtime obj = Runtime.getRuntime();
        System.out.println(obj.totalMemory());
        System.out.println(obj.freeMemory());
        for (int i = 0; i < 10000; i++) {
            new Runtime1();
        }
        System.out.println(obj.freeMemory());
        System.gc();
        System.out.println(obj.freeMemory());
    }
}
