public class Rectangle {

    int a;
    Rectangle(int l, int b){

        a=l*b;
    }
    void display(){

        System.out.println("area of rectangle is" +a);
    }
    public static void main(String[] args) {
        Rectangle Area1 =new Rectangle(4,5);
        Area1.display();
        Rectangle Area2 = new Rectangle(5, 8);
        Area2.display();
    
    }
    
}
