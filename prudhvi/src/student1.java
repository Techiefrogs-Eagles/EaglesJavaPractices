public class student1 {
    int i;
    String s;
     student1( int rollno,String name){

        i = rollno;
        s = name;
    }
     void display(){

        System.out.println(i+" "+s);
    }
        public static void main(String[] args) {
    
            student1 cstudent = new student1(2,"john");  
            cstudent.display();
    
    
    }
    
}
