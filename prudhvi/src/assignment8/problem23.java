package assignment8;

public class problem23 {
    public static void main(String[] args) {
        int arr[][] = {{1,0,0},{0,1,1},{0,0,1}};
        int rows,col;
        Boolean flag =true;
        rows =arr.length;
        col =arr[0].length;
        if(rows!=col){
            System.out.println(" given matrix is not a square matrix");
        }
        else{
            for(int i=0;i<rows;i++){
                for(int j=0;j<col;j++){
                    if(i==j&&arr[i][j]!=1){
                       flag=false;
                       break;
                    }
                    if(i!=j&&arr[i][j]!=0){
                        flag = false;
                        break;
                        
                    }
                }

            }
            if(flag){
            System.out.println("given matrix is identity matrix");
            }
            else{
                System.out.println("given matix is not a identity matrix");
            }
                    }
                    
        }
    
        
    }
    

