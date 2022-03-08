package Practice.Stacks;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stk= new Stack<>();
        stk.push(78);  
        stk.push(113);  
        stk.push(90);  
        stk.push(120);
        System.out.println(stk.isEmpty());
        System.out.println("Elements in Stack: " + stk);  
        System.out.println(stk.peek());
        pushelmnt(stk, 20); 
        try   
        {  
        popelmnt(stk);  
        }   
        catch (EmptyStackException e)   
        {  
        System.out.println("empty stack");  
        }
        int location = stk.search(120);  
        System.out.println("Location of 120: " + location);
    }  
        static void pushelmnt(Stack stk, int x)   
{  
//invoking push() method      
stk.push(new Integer(x));  
System.out.println("push -> " + x);  
//prints modified stack  
System.out.println("stack: " + stk);  
}
static void popelmnt(Stack stk)   
{  
System.out.print("pop -> ");  
//invoking pop() method   
Integer x = (Integer) stk.pop();  
System.out.println(x);  
//prints modified stack  
System.out.println("stack: " + stk);  
}    
    }

