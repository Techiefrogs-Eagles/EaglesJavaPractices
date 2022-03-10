package StackConcept;

import java.util.Stack;

public class Emptymethod {
    public static void main(String[] args) {  
        Stack<String> stk = new Stack<>();  
        boolean result = stk.empty();
        stk.push("78");  
        stk.push("113");  
        stk.push("90");  
        stk.push("120");    
        System.out.println("Elements in Stack: "+stk);      



        System.out.println("Is the Stack Empty?" + result);
    }
}
