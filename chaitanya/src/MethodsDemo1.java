public class MethodsDemo1 {
    
    public static void main(String[] args) {
        MethodsDemo1 methodDemo =new MethodsDemo1();
        methodDemo.display();
        int sum = methodDemo.sum(5,10);
        System.out.println("the sum of 2 values is "+sum);
        String name = "Satya";
        String myname = methodDemo.myMethod(name);
        System.out.println("My returned string value "+myName);
        System.out.println(methodDemo.match());
        MethodsDemo1.myStaticMethod();
        //myStaticMeetod();

    }
     
    static void myStaticMetod(){
        System.out.println("In my static method");
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

    

