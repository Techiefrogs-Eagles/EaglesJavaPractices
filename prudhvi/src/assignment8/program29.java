package assignment8;

public class program29 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row1,row2,col1,col2;
        row1=a.length;
        col1=a[0].length;
        row2=b.length;
        col2=b[0].length;
        if(col1!=row2){
            System.out.println("matrix multiplication is not posssible ");
        }
        else{
            int c[][]=new int[row2][col1];
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        c[i][j]=c[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("product of two matices :");
            for( int i=0;i<row2;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
    
}
