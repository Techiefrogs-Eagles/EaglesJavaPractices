public class Methodsdemo {
    public static void main(String[] args) { 
        Methodsdemo methoddemo = new Methodsdemo();
        int sum = methoddemo.sum(5,10);
        System.out.println("The sum of 7 values is  "+sum);
    }
    
    void display(){
        System.out.println("user defined");
    
    }

    int sum( int a, int b){
        System.out.println("my sum value");
        return a+b;
    }

    boolean metch(){
        return true;
    }

    String mymethod(String name){
        if(name == "Satya")
           return "ABC";
        else{ 
            System.out.println("hi");
            //return name;
        }
        return name;
    
    }
}
