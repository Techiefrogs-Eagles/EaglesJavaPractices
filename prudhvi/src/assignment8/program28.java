package assignment8;

public class program28 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row,col,even=0,odd=0;
        row=arr.length;
        col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println("frequency of even numbers:"+even);
        System.out.println("frequency of odd numbers:"+odd);
    }
    }
    

