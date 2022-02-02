package Assignments5;

public class Q6 {
    public static void main(String[] args) {
        BankA a=new BankA();
        BankB b=new BankB();
        BankC c=new BankC();
        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}
class Bank{
    void  getBalance(){
       return ;
    }
}
class BankA extends Bank{
    void getBalance(){
        int a=1000;
        System.out.println("amount deposited in BankA is  $"+a);
     }
}
class BankB extends Bank{
    void getBalance(){
        int a=1500;
        System.out.println("amount deposited in BankB is  $"+a);
     }
}
class BankC extends Bank{
    void getBalance(){
        int a=2000;
        System.out.println("amount deposited in BankC is  $"+a);
     }
}