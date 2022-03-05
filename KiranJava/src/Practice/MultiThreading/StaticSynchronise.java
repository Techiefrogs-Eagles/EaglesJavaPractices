package Practice.MultiThreading;

public class StaticSynchronise {
    public static void main(String t[]) {
        //Table obj=new Table();
        Mythread1 t1=new Mythread1();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();
    }
}
class Table{
    synchronized static void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
        }
        try {
            Thread.sleep(300);
        } catch (Exception e) {
            //TODO: handle exception
            
        }
    }
}
class Mythread1 extends Thread{
    
    public void run(){
        Table.printTable(5);
    }
}
class Mythread2 extends Thread{
    
    public void run(){
        Table.printTable(10);
    }
}