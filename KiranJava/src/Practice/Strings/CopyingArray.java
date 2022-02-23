package Practice.Strings;

public class CopyingArray {
    public static void main(String[] args) {
        char[] copyFrom={'a','c','d'};
        char[] copyTo=new char[3];
        System.arraycopy(copyFrom, 0, copyTo, 0, 3);
        System.out.println(String.valueOf(copyTo));
        char[] carr=copyFrom.clone();
        for (char i : carr) {
            System.out.print(i);
        }
        System.out.println(copyFrom==carr);
    }
}
