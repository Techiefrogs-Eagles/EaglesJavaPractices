package InterfaceAssignment;

public class Program6 {
    
}
interface I1
{
void A1();
void A2();

}

interface I2
{
void B1();
void B2();

}

interface I3
{
void C1();
void C2();

}
interface I4 extends I1,I2,I3{
    void D1();

}

class Ic implements I4{

   
    public void A1() {
       
        
    }

  
    public void A2() {
      
        
    }

    
    public void B1() {
        
        
    }

    
    public void B2() {
         
    }

 
    public void C1() {
        
        
    }

  
    public void C2() {
      
        
    }

 
    public void D1() {
        
        
    }
    
}