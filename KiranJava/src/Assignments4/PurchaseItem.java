package Assignments4;

public class PurchaseItem
{
    private String name;
    private double unitPrice;
    public PurchaseItem() {
    this.name = "No Item";
    this.unitPrice = 0;
}
public PurchaseItem(String name, double unitPrice) {
    this.name = name;
    this.unitPrice = unitPrice;
}
public void getData() {
    System.out.println("Name :- "+name);
    System.out.println("Unit Price :- "+unitPrice);
}
public void setData(String name, double unitprice) {
    this.name = name;
    this.unitPrice=unitprice;
}
public double getPrice(){
    return unitPrice;
}
public String toString() {
    return name + "  @ " + unitPrice ;
    }
}

