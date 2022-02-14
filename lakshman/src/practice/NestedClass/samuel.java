package practice.NestedClass;

public class samuel {
    int money = 1000000;
    {money = 1000000000;}
    class prakash{
        {money = 10;}
        static String asset = "house";
        void ABC(){
            System.out.println(money);
        }
        class pratyusha{
           static String asset1 = "car";
           String asset3 = "bike";
        }
    }
    public static void main(String[] args) {
        samuel obj1 = new samuel();
        System.out.println(obj1.money);
        samuel.prakash obj2 = obj1.new prakash();
        System.out.println(samuel.prakash.asset);
        obj2.ABC();
        samuel.prakash.pratyusha obj3 = obj2.new pratyusha();
        System.out.println(samuel.prakash.pratyusha.asset1);
        System.out.println(obj3.asset3);
    }
}

class hey{
    static int a = 10;
    int c = 123;
    static{a=20;}
    public static void main(String[] args) {
        System.out.println(hey.a);
    }
}