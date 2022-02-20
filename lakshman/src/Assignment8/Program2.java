package Assignment8;

public class Program2 {

    String[] method(String[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i].compareToIgnoreCase(a[j])>0){
                    String save = a[i];
                    a[i] = a[j];
                    a[j] = save;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        String[] str = { "data", "structure","java", "program","int", "String"};
        Program2 obj = new Program2();
        str = obj.method(str);
        for (String stri : str) {
            System.out.println(stri);
        }
    }
}
