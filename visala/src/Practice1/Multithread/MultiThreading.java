package src.Practice1.Multithread;

public class MultiThreading extends Thread {
    public static void main(String[] args) {
        MultiThreading obj=new MultiThreading();
        obj.start();
        Thread tobj=new Thread();
        tobj.start();
    }
    public void run()
        {
            System.out.println("Run");

        }
        
    }


     class MultiThreading1 implements Runnable {
        public static void main(String[] args) {
            MultiThreading1 obj1=new MultiThreading1();
            Thread tobj=new Thread(obj1 ,"Mokshitha");
            Thread tobj1=new Thread(obj1 ,"Tarak");
            System.out.println(tobj.getName());
            tobj.start();
             try{
                 tobj.join();
             }catch(Exception e){
                 
             }
            tobj1.start();
           
        }
        public void run()
            {
                System.out.println("Run");
                
                for (int i=0;i<=4;i++)
                {
                   try
                    {
                       Thread.sleep(500);
                    }
                    catch (Exception e)
                     { }

                    System.out.println(i);
                }
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getState());

                
                
            }

            
        }
    
