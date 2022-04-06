package CollectionsPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {}

class Address11
{
    String HouseName;
    char Block;
    byte FlatNo;

    Address11(String HouseName,char Block,byte FlatNo)
    {
        this.HouseName =  HouseName;
        this.Block = Block;
        this.FlatNo = FlatNo;
    }

}
    class FlatComparator implements Comparator<Object>
    {
        public int compare(Object o1, Object o2) 
        {
            Address11 s1 = (Address11)o1;
            Address11 s2 = (Address11)o2;
            if(s1.FlatNo == s2.FlatNo)
            return 0;
       else if(s1.FlatNo > s2.FlatNo)
            return 1;
       else
            return -1;
    
        }
    }
       class Address2
       {
      public static void main(String[] args) 
      {
          ArrayList<Address11> arrlist = new ArrayList<Address11>();
          arrlist.add(new Address11("Titanic",'D',(byte)15));
          arrlist.add(new Address11("Rosy",'A',(byte)20));
          arrlist.add(new Address11("Jack",'C',(byte)5));
          arrlist.add(new Address11("Mike",'B',(byte)10));

          Collections.sort(arrlist, new FlatComparator());
          for(Address11 S11 :arrlist)
          {
              System.out.println(S11.HouseName+" "+S11.Block+" "+S11.FlatNo);
          }

      }
    }