package src.Revision.Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQ {
    public static void main(String[] args) {
        // PriorityQueue
        Queue<String> pobj = new PriorityQueue<>();
        pobj.add("One");
        pobj.add("Two");
        pobj.add("Three");
        pobj.add("Four");
        System.out.println(pobj);
        pobj.offer("Five");
        System.out.println(pobj);
        System.out.println(pobj.remove("Five"));
        System.out.println(pobj.element());
        System.out.println(pobj.poll());
        System.out.println(pobj.peek());

        // ArrayDeque

        Deque<Student> dobj = new ArrayDeque<Student>();
        Student s = new Student("Arha", 1);
        Student s1 = new Student("Ayaan", 2);
        Student s2 = new Student("Adya", 3);
        Student s3 = new Student("Abhai", 4);

        dobj.add(s);
        dobj.add(s1);
        dobj.add(s2);
        dobj.add(s3);
        for (Student student : dobj) {

            System.out.println(student.name + "...." + student.roll_no);
        }
        System.out.println("Isemty");
        System.out.println(dobj.isEmpty());
        System.out.println("Polllast the elements");

        dobj.pollLast();
        for (Student student : dobj) {
            System.out.println(student.name + "...." + student.roll_no);
        }
        System.out.println("Pollfirst the elements");
        dobj.pollFirst();
        for (Student student : dobj) {
            System.out.println(student.name + "...." + student.roll_no);
        }

        System.out.println("Peek hte elements");
        dobj.peek();
        for (Student student : dobj) {
            System.out.println(student.name + "...." + student.roll_no);
        }
    }

}

class Student {

    String name;
    int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
}
