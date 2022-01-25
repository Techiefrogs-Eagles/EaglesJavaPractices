public class classintancedemo {

    int i = 10;
    String str ="Hello";

    public static void main(String[] args) {
        int a = 17;
       
        classintancedemo classobject = new classintancedemo() ;
        
        classobject.str = "team";

        classintancedemo cobject1 = new classintancedemo();
        cobject1.str = "eagles";

    System.out.println(classobject.i+"  "+classobject.str);

    }
    
}
