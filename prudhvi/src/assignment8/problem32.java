package assignment8;

public class problem32 {
    public static void main(String[] args) {
        int a[][]={{1,2},{1,2,3}};
        int b[][]={{1,2},{1,2,3}};
        int row=a.length;
        int col=a[0].length;
        int c[][]=new int[row][col];
        
    
    
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }

    }
}
