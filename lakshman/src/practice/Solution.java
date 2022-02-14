package practice;
//import java.util.Scanner;
//import java.util.*;

class Solution{
    public static void main(String []argh){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ref1=0;
            int result;
            int result1;
            if(i==0)
            {
                for(int j=a;j<n;j++)
                {
                    int print=(int)((Math.pow(2,j)*b));
                    result = ref1+print;
                    result1= a+result;
                    System.out.print(result+" ");
                    ref1 = result;
                }
            
            }
            else if(i==1) {
            System.out.println();
            ref1= 0;
            result=0;
            result1 = 0;
            for(int k=0;k<n;k++)
            {
                int print=(int)((Math.pow(2,k)*b));
                result = ref1+print;
                result1= a+result;
                System.out.print(result1+" ");
                ref1 = result;
            }
            }
            
            
        }
        in.close();
    }
}