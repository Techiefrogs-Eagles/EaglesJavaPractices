package Assignment5;

public class bank 
{
    int getBalance(){
        return 0;
    }
}

class bankA extends bank{
    int getBalance(){
        return 1000;
    }
    public static void main(String[] args) {
        bankA oA = new bankA();
        System.out.println(oA.getBalance()+"$");
    }
}

class bankB extends bank{
    int getBalance(){
        return 1500;
    }
    public static void main(String[] args) {
        bankB oB = new bankB();
        System.out.println(oB.getBalance()+"$");
    }
}

class bankC extends bank{
    int getBalance(){
        return 2000;
    }
    public static void main(String[] args) {
        bankC oC = new bankC();
        System.out.println(oC.getBalance()+"$");
    }
}
