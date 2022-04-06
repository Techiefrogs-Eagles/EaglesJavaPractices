package src.Practice1.Collections;

import java.util.ArrayList;
import java.util.Collections;

import javax.lang.model.util.ElementScanner14;
import javax.security.auth.Subject;

public class ComparablePractice1 {
    public static void main(String[] args) {
        ArrayList<Student1> A1 = new ArrayList<>();
        A1.add(new Student1(15, "Visala", "nvisala536@"));
        A1.add(new Student1(36, "Siva", "nsiva536@"));
        A1.add(new Student1(16, "Lakshmi", "Lakshmi@"));
        Collections.sort(A1);
        for (Student1 student1 : A1) {
            System.out.println(student1.RollNo + " " + student1.Name + " " + student1.Mailid);

        }

    }

}

class Student1 implements Comparable<Student1> {
    int RollNo;
    String Name;
    String Mailid;

    Student1(int RollNo, String Name, String Mailid) {
        this.RollNo = RollNo;
        this.Name = Name;
        this.Mailid = Mailid;

    }

    public int compareTo(Student1 S1) {

        return Name.compareTo(S1.Name);
    }

}