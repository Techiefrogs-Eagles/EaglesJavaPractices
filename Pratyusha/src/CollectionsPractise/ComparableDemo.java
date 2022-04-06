package CollectionsPractise;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo 
{}
  class Address implements Comparable<Address>
  {
      String HouseName;
      char Block;
      byte FlatNo;

      Address(String HouseName,char Block,byte FlatNo)
      {
          this.HouseName =  HouseName;
          this.Block = Block;
          this.FlatNo = FlatNo;
      }
      
      public int compareTo(Address O) 
    {
        if(FlatNo == O.FlatNo)
             return 0;
        else if(FlatNo > O.FlatNo)
             return 1;
        else
             return -1;
    }
      
  }
    class Address1
    {
        public static void main(String[] args) 
        {
            ArrayList<Address> arrlist = new ArrayList<Address>();
            arrlist.add(new Address("Titanic",'D',(byte)15));
            arrlist.add(new Address("Rosy",'A',(byte)20));
            arrlist.add(new Address("Jack",'C',(byte)5));
            arrlist.add(new Address("Mick",'B',(byte)10));

            Collections.sort(arrlist);
            for(Address O :arrlist)
            {
                System.out.println(O.HouseName+" "+O.Block+" "+O.FlatNo);
            }

        }
    } 
   