package Assignment1;
// i as rows and j as columns
public class Floydstriangle {
    public static void main(String[] args) {
        int n = 4;
        int p = 1; // this declaration of p adds 1 to the row value each time
      for(int i = 1; i <= n; i++){                                                           
               
            for(int j = 1; j <= i; j++){//here we start printing numbers in columns// inner loop is set from 1 to i
            System.out.print(p++ +" "); 
            }
            System.out.println();
               
        } 
    }     
}
