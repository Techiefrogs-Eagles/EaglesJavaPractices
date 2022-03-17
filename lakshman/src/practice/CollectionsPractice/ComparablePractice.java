package practice.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int i;
    String str;
    char c;
    Student(int i,String str,char c){
        this.i = i;
        this.str = str;
        this.c = c;
    }
    public int compareTo(Student s) {
        if (i == s.i) {
            return 0;
        } else if(i>s.i){
            return 1;
        }else{
            return -1;
        }
    }
}
public class ComparablePractice 
{
    public static void main(String[] args) 
    {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student(2, "one", 'a'));
        arr.add(new Student(0, "two", 'b'));
        arr.add(new Student(1, "three", 'c'));

        Collections.sort(arr);
    
        for (Student student : arr) {
            System.out.println(student.i+"  "+student.str+"  "+student.c);
        }
    }
}
