package Assignment4;

 class program9 {}

class purchaseitem
{
    private String name;
    private double unitPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    purchaseitem(String a,double b)
    {
        name = a;
        unitPrice = b;
    }
} 

class Weigheditem extends purchaseitem
{
    private double weightInKg;

    Weigheditem(double a){
        super("vegetables", 0);
        weightInKg = a;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public double getPrice() {
        return 150.0;
    }
}

class counteditem extends purchaseitem
{
    private int quantity;

    counteditem(int b){
        super("apple", 0);
        quantity = b;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return 100.0;
    }
}

class challenge
{
    
    public static void main(String[] args) {
        Weigheditem wobj = new Weigheditem(5.0);
        counteditem cobj = new counteditem(10);  
        System.out.println(wobj.getName()+"  "+wobj.getWeightInKg()+"kg  "+wobj.getPrice()+"rs");
        System.out.println(cobj.getName()+"  "+cobj.getQuantity()+"n  "+cobj.getPrice()+"rs");      
    }
}
