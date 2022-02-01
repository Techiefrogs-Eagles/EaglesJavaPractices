package Assignments4;

public class WeighedItem extends PurchaseItem
{
private double weight;
public WeighedItem() {
}
public WeighedItem(double weight) {
this.weight = weight;
}
public double getWeight() {
return weight;
}

public void setWeight(double weight) {
this.weight = weight;
}

public double getPrice()
{
return weight*super.getPrice();
}
public String toString() {

    return super.toString()+"  "+weight+"  kg "+getPrice()+" Rs";
    }
}