package assignment8;

public class problem22 {
    public static void main(String[] args) {
        int a[][] =new int[][]{{1,2,3},{2,3,4},{3,4,5}};
        int b[][]= new int[][]{{1,2,1},{1,1,1},{1,1,1}};
        int arr[][] =new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=a[i][j]-b[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
