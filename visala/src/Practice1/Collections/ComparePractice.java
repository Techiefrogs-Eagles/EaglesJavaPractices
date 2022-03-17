package src.Practice1.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparePractice {
    public static void main(String[] args) {
        
    
      ArrayList<Comunitie> A2=new ArrayList<>();
      A2.add(new Comunitie(2, 2014, "Siva"));
      A2.add(new Comunitie(3, 3014, "Tarak"));
      A2.add(new Comunitie(11, 1101, "Visala"));
       Collections.sort(A2,new Block());
       for (Comunitie comunitie : A2) {
           System.out.println(comunitie.Block+" "+comunitie.Name+" "+comunitie.HouseNum);
       }
       System.out.println();
       Collections.sort(A2,new Name());
       for (Comunitie comunitie : A2) {
           System.out.println(comunitie.Block+" "+comunitie.Name+" "+comunitie.HouseNum);
      
        }
        System.out.println();
        
        Collections.sort(A2,new HouseNuum());
        for (Comunitie comunitie : A2) {
              System.out.println(comunitie.Block+" "+comunitie.Name+" "+comunitie.HouseNum);
        }
    }
}
class Comunitie {
    int Block;
    int HouseNum;
    String Name;
    Comunitie(int Block,int HouseNum,String Name)
    {
        this.Block=Block;
        this.HouseNum=HouseNum;
        this.Name=Name;

        
    }
}
 class Block implements Comparator<Object>{


    public int compare(Object o1, Object o2) {
           Comunitie C1=(Comunitie)o1;
           Comunitie C2=(Comunitie)o2;
          if( C1.Block == C2.Block)
          {
              return 0;
          }
           else if(C1.Block> C2.Block)
           {
               return 1;

           }
        
           else       
           {
               return -1;

           }    
                       
    }
  
         
 }
     class Name implements Comparator<Object>{


        public int compare(Object o1, Object o2) {
           Comunitie C1=(Comunitie)o1;
           Comunitie C2=(Comunitie)o2;
          return C1.Name .compareTo(C2.Name);
    }
 }


    class HouseNuum implements Comparator<Object>{
           public int compare(Object o1, Object o2) {
           Comunitie C1=(Comunitie)o1;
           Comunitie C2=(Comunitie)o2;
          if( C1.HouseNum == C2.HouseNum)
          {
              return 0;
          }
           else if(C1.HouseNum> C2.HouseNum)
           {
               return 1;

           }
        
           else       
           {
               return -1;

           }    
                       
    }
  
         
 }
