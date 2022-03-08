    package src.MethodsAssignment;

public class Bank {
    int getBalance()
    {
        return 0;

    }
}
class BankA extends Bank{
    int getBalance()
    {
        return 1000;

    }
   /* public static void main(String[] args) {
        BankA BA=new BankA();
        System.out.println(BA.getBalance()+"a");
    }*/
}

class BankB extends Bank{
    int getBalance()
    {
        return 1500;

    }
  /*  public static void main(String[] args) {
        BankA BB=new BankA();
        System.out.println(BB.getBalance()+"a");
    }*/
}

class BankC extends Bank{
    int getBalance()
    {
        return 2000;

    }
    public static void main(String[] args) {
        BankC BC=new BankC();
        BankB BB=new BankB();
        BankA BA=new BankA();
        System.out.println("$"+BA.getBalance());
        System.out.println("$"+BB.getBalance());
        System.out.println("$"+BC.getBalance());
    }
}