package Practice.Stacks;

import java.util.Iterator;
import java.util.Stack;

public class StackExampl {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();  
        stk.push(22);  
        stk.push(33);  
        stk.push(44);  
        stk.push(55);  
        stk.push(66);  
        System.out.println("The stack size is: "+stk.size());
        Iterator iterator = stk.iterator();  
        while(iterator.hasNext())  
        {  
        Object values = iterator.next();  
        System.out.println(values);   
        }  
        //invoking forEach() method for iteration over the stack  
        stk.forEach(n ->  
        {  
        System.out.println(n);  
        });      

    }
}
