package assignment8;

public class EvenOddarray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,8,9,7,4,2};
        System.out.println("Even numbers :");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
               
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}
