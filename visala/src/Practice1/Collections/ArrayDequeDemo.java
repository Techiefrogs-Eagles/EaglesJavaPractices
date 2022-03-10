package src.Practice1.Collections;
import java.util.ArrayDeque;
import java.util.Deque;

/*public class ArrayDequeDemo 
{
    public static void main(String[] args) 
    {
        Deque<String> dd = new ArrayDeque<String>();
        dd.add("Rabbit");
        dd.add("Pegion");
        dd.add("Cat");
        dd.offerFirst("Puppy");
        System.out.println("After 1st transverse");

        for(String str : dd)
        {
           System.out.println(str);
        }

        dd.pollLast();
        System.out.println("After Transversal");
        for(String str1 : dd)
        {
           System.out.println(str1);
        }
    }
}*/
class Pet {    
   
    String name;    
    int quantity;    
    public Pet(String name,int quantity) 
    {       
        this.name = name;        
        this.quantity = quantity;    
    }    
    }    
       class ArrayDequeDemo1{    
    public static void main(String[] args) 
    {    
        Deque<Pet> set=new ArrayDeque<Pet>();    
        //Creating Books    
        Pet  p1 = new Pet("Nemo",2);
        Pet  p2 = new Pet("Saint Bernard",3); 
        Pet  p3 = new Pet("Golden Retriver",4); 
        Pet  p4 = new Pet("Lab",5);     
         
        //Adding Pet to Deque   
        set.add(p1);    
        set.add(p2);    
        set.add(p3);    
        set.add(p4);
        //Traversing ArrayDeque  
        for(Pet p:set){    
        System.out.println(p.name+" "+" "+p.quantity);    
        }    
    }    
    }