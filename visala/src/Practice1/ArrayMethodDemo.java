package src.Practice1;

public class ArrayMethodDemo {
       
    public static void main(String[] args) 
    {
     
        ArrayMethodDemo Aobj=new ArrayMethodDemo();

       int arr1[]= Aobj.method(new int[]{10,20,30});
      for (int i : arr1) 
      {
          System.out.print(i+" ");
      }
      System.out.println();

    // String sarr[]={"a","b","c","d","e"};           //declaration ,instaintiation,inisilazation 
     String sarr1[]=Aobj.method1(new String[]{"a","b","c","d","e"});   //anonymous way
     for (String s : sarr1)
      {
         System.out.print(s+" ");
         
      }
     System.out.println();
      for (char c : arr2) {
          System.out.print(c+" ");
      }
     
    }
         int[] method(int[] a)
         {
             System.out.println("This is int method");
             return a;
         }
        
         String[] method1(String[] s)
         {
             System.out.println("This  is string method");
            return s;
         }

        static char arr2[]={'A','B','c'};
        static char[] method2(char[] c)
         {
             System.out.println("This is char method");
             return c;
         }
    }

