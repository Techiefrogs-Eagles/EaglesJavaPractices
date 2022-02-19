package assignment8;

public class Ascendingorder {
    public static void main(String[] args) {
        
        int arr[] = new int[]{1,5,9,7,4,2};
        int temp=0;
        System.out.println("Before ascending order :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }

            }
        
        System.out.println();
        System.out.println("After ascending order :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            

        }
    }
    
}
