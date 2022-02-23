package assignment8;

public class program30 {
    public static void main(String[] args) {
        int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
        int row =a.length;
        int col=a[0].length;
        int sumrow=0;
        int sumcol=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sumrow=sumrow+a[i][j];
            }
            System.out.println("sum of row"+(i+1)+":" +sumrow);
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                sumcol=sumcol+a[j][i];
            }
            System.out.println("sum of column"+(i+1)+":" +sumcol);
        }
    }
}
