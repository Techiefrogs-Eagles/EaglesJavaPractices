package practice.Miscellaneous;


import java.util.*;




public class Solution1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countw = 1;
        while(scan.hasNext()){
            String a = scan.nextLine();
            System.out.println(countw+" "+a);
            countw++;
            scan.close();
        }
    }
}
