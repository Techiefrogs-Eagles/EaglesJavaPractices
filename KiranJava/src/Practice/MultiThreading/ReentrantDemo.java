package Practice.MultiThreading;

public class ReentrantDemo {
    public static void main(String args[]){  
        final ReentrantDemo re=new ReentrantDemo();  
          
        Thread t1=new Thread(){  
        public void run(){  
        re.m();//calling method of Reentrant class  
        }  
        };  
        t1.start();  
    }
}
class Reentrant {  
    public synchronized void m() {  
    n();  
    System.out.println("this is m() method");  
    }  
    public synchronized void n() {  
    System.out.println("this is n() method");  
    }  
}  

