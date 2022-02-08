package Assignment5;

public class program9 {}

class customer{
    String name = "lakshman";
    String mobile = "8498957031";
    String address = "rajahmundry";

    void customerMethod(){
        System.out.println("customer details = "+name+"  "+mobile+"  "+address);
    }

}

class account{
    int AC_no = 120520020;
    String type = "savings account";

    void accountMethod(){
        System.out.println("account details = "+AC_no+"  "+type);
    }
}

class RBI{
    double intrestRate = 4;
    double withDrawalLimit = 10000;

    void RBImethod(){
        System.out.println("intrest rate = "+intrestRate+"%    withdrawal limit = "+withDrawalLimit);
    }

    public double getIntrestRate() {
        return intrestRate;
    }
    
    public double getWithDrawalLimit() {
        return withDrawalLimit;
    }
}

class SBI extends RBI{
    String branch = "HAWKS branch";
    String ifsc = "SBIN000";

    void SBImethod(){
        System.out.println("branch :- "+branch+"   IFSC code :- "+ifsc);
    }

    public static void main(String[] args) {
        customer obj1 = new customer();
        account obj2 = new account();
        SBI obj = new SBI();
        System.out.println("BANK NAME :- STATE BANK of INDIA");
        obj1.customerMethod();
        obj2.accountMethod();
        obj.RBImethod();
        obj.SBImethod();


    }
}

class ICICI extends RBI{
    String branch = "EAGLES";
    String ifsc = "ICIC1000";

    void ICICImethod(){
        System.out.println("branch :- "+branch+"   IFSC code :- "+ifsc);
    }

    public static void main(String[] args) {
        customer obj1 = new customer();
        account obj2 = new account();
        ICICI obj = new ICICI();
        System.out.println("BANK NAME :- INDUSTRIAL CREDIT and INVESTMENT CORPORATIO of INDIA");
        obj1.customerMethod();
        obj2.accountMethod();
        obj.RBImethod();
        obj.ICICImethod();


    }
}