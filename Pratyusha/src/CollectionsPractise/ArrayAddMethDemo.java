package CollectionsPractise;

import java.util.ArrayList;

public class ArrayAddMethDemo 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arobj = new ArrayList<Integer>();
        arobj.add(10);
        arobj.add(20);
        arobj.add(30);
        arobj.add(40);
        arobj.add(50);

        ArrayList<Integer> arobj1 = new ArrayList<Integer>();
        arobj1.add(100);
        arobj1.add(200);
        arobj1.add(300);
        arobj1.add(400);
        arobj1.add(500);

        arobj1.add(5 , 600);

        arobj.addAll(arobj1);
        for(Integer integer : arobj)
        {
            System.out.print(integer+" ");
        }
        System.out.println();
        arobj.remove((Integer)30);

        for(Integer integer : arobj)
        {
            System.out.print(integer+" ");
        }
        System.out.println();  
        
        arobj.retainAll(arobj1);
        for ( Integer integer : arobj)
        {
            System.out.print(integer+" ");
        }  
        System.out.println();
    }
}
