package src.Revision;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streamfilter {
    public static void main(String[] args) {
        /*
         * List<Student> list1 = new ArrayList<Student>();
         * for (Student student : getStudent()) {
         * if (student.getId() >= 2) {
         * list1.add(student);
         * 
         * }
         * }
         * for (Student student : list1) {
         * System.out.println(student);
         * }
         */

        // StreamAPI
        List<Student> list2 = getStudent().stream().filter((student) -> student.getId() >= 2)
                .collect(Collectors.toList());
        list2.forEach(System.out::println);
    }

    private static List<Student> getStudent() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Lakshmi"));
        list.add(new Student(2, "Mokshitha"));
        list.add(new Student(3, "Tarak"));
        return list;

    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

}