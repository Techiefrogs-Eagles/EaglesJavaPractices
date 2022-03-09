package CollectionsPractise;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo 
{
    public static void main(String[] args) 
    {
        Stack<Integer> S=new Stack<>();
        S.add(1);
        S.add(2);
        S.add(3);
        S.add(4);
        S.add(5);
        S.add(6);

        S.pop();

        S.push(7);
       
      
        System.out.println(S);
        System.out.println(S.search(2));
        System.out.println(S.peek());
     //  System.out.println(S.removeAll(S));
        if(S.empty())
        {
            System.out.println("Empty stack");
        }
        else{
            System.out.println("Not Empty stack");
        }
        
        System.out.println(S.size());

        Iterator<Integer> itr=S.iterator();
        while(itr.hasNext())
        {
           System.out.println(itr.next());
        }
        
        for (Integer integer : S) {
            System.out.println(integer);
        }
        

    }
    
}
