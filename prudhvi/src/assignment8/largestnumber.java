package assignment8;

public class largestnumber {
    public static void main(String[] args) {
        int arr[]= new int[]{90,6,76,99,4};
        int max=arr[0];
         for(int i=0;i<arr.length;i++){
             if(arr[i]>max){
                 max=arr[i];
             }
            
         }
         System.out.println(max);
    }
    
}
