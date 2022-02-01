package Assignments4;

public class CountedItem extends PurchaseItem
{
    private int quantity;
    public CountedItem() {
}
    public CountedItem(int quantity) {
    this.quantity = quantity;
}
public int getQuantity() {
    return quantity;
}

public void setQuantity(int quantity) {
    this.quantity = quantity;
}

public double getPrice()
{
return quantity*super.getPrice();
}
public String toString() {
    return super.toString()+"  "+quantity+"  units "+getPrice()+"  rs";
    }
}
