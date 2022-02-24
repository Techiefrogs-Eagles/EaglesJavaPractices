package assignment8;

public class program34 {
    public static void main(String[] args) {
        int arr[]=new int[]{4,7,9,23,45,90};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("average of given array :"+(sum/arr.length));
    }
    
}
