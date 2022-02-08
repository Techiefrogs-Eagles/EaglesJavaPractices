package practice;

public class murthyGP 
{
    int money = 50000000;
    String asset1 = "car,bike";
    private String asset2 = "house";
    static int f = 20;


    public String getAsset2() {
        return asset2;
    }

    public void setAsset2(String asset2) {
        this.asset2 = asset2;
    }


    void newmethod(){
        System.out.println("murthy.hello");
    }

    void coconutFields()
    {
        System.out.println("COCONUTFIELDS");
    }

    murthyGP()
    {
        System.out.println("printing GP constructor without param");
    }
    
    murthyGP(int a,String b){
        System.out.println("printing GP constructor");
    }

    static void hospital(){
        System.out.println("in gp static method");
    }

    public static void main(String[] args) 
    {
        murthyGP obj = new murthyGP(5,"hello");
        System.out.println(obj.money);
        System.out.println(obj.asset2);
        murthyGP.f = 30;

    }

}

