public class Fullpyramidusingstar {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <=rows; i++) {
            for(int s = rows-i; s > 0;s--) {
                System.out.print(" ");
            }
            for(int j = 1; j< i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
