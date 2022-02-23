package assignment8;

public class program31 {
    public static void main(String[] args) {
        int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
        int b[][] =new int[3][3];
        System.out.println("Orginal matrix :");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                b[i][j]=a[j][i];
            }
        }
        System.out.println("Tranpose matrix:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
