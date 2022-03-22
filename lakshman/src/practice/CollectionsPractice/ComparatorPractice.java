package practice.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1 
{
    int i;
    String str;
    char c;
    Student1(int i,String str,char c)
    {
        this.i = i;
        this.str = str;
        this.c = c;
    }   
}

class comparator1 implements Comparator<Object>
{
    public int compare(Object o1, Object o2) 
    {
        Student1 a = (Student1)o1;
        Student1 b = (Student1)o2;

        if (a.i == b.i)
        {
            return 0;
        } 
        else if(a.i > b.i)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

class comparator2 implements Comparator<Object>
{
    public int compare(Object o1, Object o2) 
    {
        Student1 a = (Student1)o1;
        Student1 b = (Student1)o2;

        return a.str.compareTo(b.str);
    }
}

public class ComparatorPractice 
{
    public static void main(String[] args) 
    {
        ArrayList<Student1> arr = new ArrayList<>();
        arr.add(new Student1(2, "one", 'a'));
        arr.add(new Student1(0, "two", 'b'));
        arr.add(new Student1(1, "three", 'c'));

        Collections.sort(arr, new comparator2());
    
        for (Student1 student1 : arr) 
        {
            System.out.println(student1.i+"  "+student1.str+"  "+student1.c);
        }
    }
}
