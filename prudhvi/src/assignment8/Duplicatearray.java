package assignment8;

public class Duplicatearray {
    public static void main(String[] args) {
        
        int arr[] = new int[]{1,2,3,6,9,3,5,6,1};
         for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                 if(arr[i]==arr[j]){
                     System.out.println(arr[i]);

                 }
             }
         }
    }
    
}
