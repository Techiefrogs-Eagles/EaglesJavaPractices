package Assignments8;

public class Pr23 {
static int count=0;
    public static void main(String[] args) {
        String str="lvk,." ;
        for(int i=0; i<=str.length()-1; i++){
            char ch=str.charAt(i);
            if(ch == '.'|| ch == ','|| ch == '!' ){
                count++;
            }
   
        
    }
    System.out.println("number of punctuation marks"+ count);
}
}
