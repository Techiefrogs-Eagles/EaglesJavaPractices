package AbstractAssignment;

public class Program2 {
    
}
abstract class Bank
{
    abstract void getBalance();
   
}



class BankA extends Bank{
    void getBalance(){
     System.out.println("$100");
    }

}

class BankB extends Bank{

    void getBalance()
    {
        System.out.println("$150");  
    }
}

class BankC extends Bank{

    void getBalance()
    {
        System.out.println("$200");
    }

}

class Bank1
{
    public static void main(String[] args) {
        BankA BA=new BankA();
        BA.getBalance();
        BankB BB=new BankB();
        BA.getBalance();
        BankC BC=new BankC();
        BA.getBalance();
    }
}