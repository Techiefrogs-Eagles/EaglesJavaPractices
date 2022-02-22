package assignment8;

public class Sumofevenodd {
    public static void main(String[] args) {
        int arr[] =new int[]{1,2,3,4,5,6};
        int Sum =0 ,temp=0;
        System.out.println("Sum of Odd numbers :");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                Sum =Sum+arr[i];
            }
            
        }
        System.out.println(Sum);
        System.out.println();
        System.out.println("Sum of Even numbers :");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0){
                temp =temp+arr[i];
            }
        }
        System.out.println(temp);
    }
    
}
