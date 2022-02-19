package Assignments9;

public class Pr5_6 {
    public static void main(String[] args) {
        int [] arr1 = new int [] {1, 2, 3, 4, 5}; 
        for (int i = 0; i < arr1.length; i++) {     
            System.out.print(arr1[i] + " ");    
         }  
         
         System.out.println(" Reverse Order is");
         for (int i = arr1.length-1; i >=0; i--) {     
            System.out.print(arr1[i] + " ");    
         } 
    }
}
