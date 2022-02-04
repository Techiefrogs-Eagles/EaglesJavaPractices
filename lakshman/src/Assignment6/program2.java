package Assignment6;

public class program2 {}

abstract class Bank{
    abstract void getBalance();
}

class BankA extends Bank
{
    void getBalance(){
        System.out.println("100$ Deposited in BankA");
    }
}

class BankB extends Bank
{
    void getBalance(){
        System.out.println("150$ Deposited in BankB");
    }
}

class BankC extends Bank
{
    void getBalance(){
        System.out.println("200$ Deposited in BankC");
    }
}

class driverclass
{
    public static void main(String[] args) {
        BankA obj1 = new BankA();
        obj1.getBalance();
        BankB obj2 = new BankB();
        obj2.getBalance();
        BankC obj3 = new BankC();
        obj3.getBalance();
    }
}
