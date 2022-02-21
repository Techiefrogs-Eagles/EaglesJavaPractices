package assignment8;

public class Largest2number {
    public static void main(String[] args) {
        int arr[] = new int[]{67,76,90,23,60,75};
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
          
        }
        System.out.print(arr[arr.length-2]);
        
    }
    
}
