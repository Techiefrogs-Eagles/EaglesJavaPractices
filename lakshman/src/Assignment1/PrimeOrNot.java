package Assignment1;

public class PrimeOrNot {
    public static void main(String[] args) {
        int input=3;
            int a= 0;
            int b=0;    
            a=input/2;      
            if(input==0||input==1)
            {  
                System.out.println(input+" is not prime number");      
            }
            else
            {  
                for(int i=2;i<=a;i++){      
                if(input%i==0){      
                System.out.println(input+" is not prime number");      
                b=1;      
                break;      
            }      
            if(b==0)  { System.out.println(input+" is prime number"); }  
            }  
          }    
    }
}
