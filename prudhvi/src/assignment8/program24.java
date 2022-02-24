package assignment8;

public class program24 {
    public static void main(String[] args) {
        int arr[][]={{2,0,0},{0,5,0},{0,0,9}};
        int row,col,count=0;
        row=arr.length;
        col=arr[0].length;
        int size=row*col;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==0){
                    count++;

                }
            }
        }
        if(count>(size/2)){
            System.out.println("given matrix is a sparse matrix ");
        }
        else{
            System.out.println("given matrix is not a sparse matrix");
        }
    }
    
}
