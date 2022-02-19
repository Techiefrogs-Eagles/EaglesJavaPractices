package assignment8;

public class Smallestnumber {
    public static void main(String[] args) {
        int arr[] = new int[]{4,6,9,3,5,8};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    
}
