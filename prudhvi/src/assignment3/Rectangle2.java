package assignment3;
import java.util.Scanner;
public class Rectangle2 {
    int a;
   
       Rectangle2( int l,int b){
          
        a = l*b;
    }
    void display(){
          
        System.out.println("area of the rectangle :" +a);

    }
   
    public static void main(String[] args) {
        int lenght;
        int breadth;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lenght of rectangle :");
        lenght =sc.nextInt();
        System.out.println("enter the breadth of rectangle :");
        breadth = sc.nextInt();
        Rectangle2 area = new Rectangle2(lenght,breadth);
        area.display();
        sc.close();
    }

    
}
