package assignment8;

public class program26 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row,col;
        row=a.length;
        col=a[0].length;
        if(row!=col){
            System.out.println("matix is not a square matrix");
        }
        else{
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(i>=j){
                        System.out.print(a[i][j]+" ");
                    }
                    else{
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }
        }
    }
    
}
