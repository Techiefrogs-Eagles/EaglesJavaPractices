package assignment8;

public class Leftrotate {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5,6};
        int n =4;

        System.out.println("Before rotate :");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i =0;i<n;i++){
            int j,first;
           first = arr[0];
           for(j =0;j<arr.length-1;j++){
               arr[j]=arr[j+1];
           }
           arr[j]=first;
        }
        System.out.println();
        System.out.println("After left rotated : ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
