package Basicpractice;

public class ConstructorDemo {
    String S1;
    String S2;
    String S3;
       
    public ConstructorDemo(){

        S1 = "Indian Bank";
        S2 = "Chennai Branch";
        S3 = "IDIB000A089";
    }

    public static void main(String[] args) {
               
        ConstructorDemo Sruthi = new ConstructorDemo();
        int No = 8676100;
        System.out.println("Account No: " +No);
        System.out.println("Name: Sruthi");
        //System.err.println(Sruthi.i);
        System.out.println("Bank Name: " + Sruthi.S1 + "," + " Branch Name: " + Sruthi.S2 + "," + " IFSC Code: " + Sruthi.S3);

        ConstructorDemo Vinoth = new ConstructorDemo();
        int No1 = 8676101;
        System.out.println("Account No: " +No1);
        System.out.println("Name: Vinoth");
        System.out.println("Bank Name: " + Vinoth.S1 + "," + " Branch Name: " + Vinoth.S2 + "," + " IFSC Code: " + Vinoth.S3);

        ConstructorDemo AV = new ConstructorDemo();
        int No2 = 8676102;
        System.out.println("Account No: " +No2);
        System.out.println("Name: AV");
        System.out.println("Bank Name: " + AV.S1 + "," + " Branch Name: " + AV.S2 + "," + " IFSC Code: " + AV.S3);
        

    }
    
}
