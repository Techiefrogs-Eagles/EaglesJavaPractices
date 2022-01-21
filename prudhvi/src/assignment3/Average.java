package assignment3;

public class Average {
    int s;
    Average(int a,int b,int c){

        s =(a+b+c)/3;
    }
    void display(){

         System.out.println("Average is "+s);
    }
    public static void main(String[] args) {
        Average sum =new Average(3,4,5); 
        sum.display();
    }
    
}
