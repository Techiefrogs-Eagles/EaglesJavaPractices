package Assignment8.StringExcersises;

public class Program13 {
        public static void main(String[] args) {
            StringBuffer str = new StringBuffer("Golden Retriver");
            System.out.println(str+" "+str.capacity());
             str.setLength(0);
            System.out.println(str);
}
}