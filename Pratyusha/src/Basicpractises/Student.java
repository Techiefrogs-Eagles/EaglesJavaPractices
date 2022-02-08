package Basicpractises;

public class Student {
    
    int id;
    String Name;
    double marks;
    void display() {
        System.out.println("***********************");
        System.out.println("Name = "+ Name);
        System.out.println("id = "+ id);
        System.out.println("marks = "+marks);
        System.out.println("**********************");
    }
}
class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.id = 12;
        obj.Name = "Nimmy";
        obj.marks = 89.30;
        obj.display();
    }
}
