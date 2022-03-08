package src.Assignment3;

public class ClassDemo {
  
 
      int i=1;
     String name;
 static int j=500;
    public static void main(String[] args) {
        
 ClassDemo  classobj=new ClassDemo();
// testmethod();
 classobj.i= 1;
 classobj.name= "tarak";
 ClassDemo.j=500;
 ClassDemo.testmethod();
 System.out. println(classobj.i+" "+classobj.name+" "+ClassDemo.j);
 


 ClassDemo classobj1=new ClassDemo();
 classobj1.i=2;
 classobj1.name="Mokshitha";
 ClassDemo.j=500;

// ClassDemo.testmethod();
 System.out.println(classobj1.i+" " +classobj1.name+ " "+ClassDemo.j);

      
       
     
 }
static void testmethod()
{
    System.out.println("Iam a test method");
    
}

  }
    

