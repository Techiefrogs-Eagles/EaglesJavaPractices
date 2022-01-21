public class student2 {
    int i;
    String s;
     student2( int rollno,String name){

        i = rollno;
        s = name;
    }
     void display(){

        System.out.println(i+" "+s);
    }
        public static void main(String[] args) {
    
            student2 cstudent1 = new student2(2,"john");  
            cstudent1.display();
            student2  cstudent2 = new student2(5,"sam");
            cstudent2.display();    
    
    }
    
    
}
