package assignment8;

public class Sumofarray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,5,9,7,4,2};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum +arr[i];
        }
        System.out.println("sum of an array :"+sum);
    }
    
}
