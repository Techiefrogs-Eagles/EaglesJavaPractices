package practice.CollectionsPractice;
 
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
 
public class VectorPractice 
{
    public static void main(String[] args) 
    {
        String arr[] = new String[13];

        /*ArrayList<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(0);
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        obj1.add(4);
        obj1.add(5);*/
        
        //Vector<String> obj = new Vector<>(5);
        //Vector<String> obj = new Vector<>(5,10);
        //Vector<Integer> obj = new Vector<>(obj1);
        //System.out.println(obj.size()+"    "+obj.capacity());

        Vector<String> obj = new Vector<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");
        obj.add("F");

        Vector<String> obj2 = new Vector<>();
        obj2.add("G");
        obj2.add("H");
        obj2.add("I");
        obj2.add("J");
        obj2.add("K");
        obj2.add("L");
        
        obj.addAll(obj2);
        obj.addElement("M");
        //obj.clear();
        //System.out.println(obj.isEmpty());
        //System.out.println( obj.contains("M"));
        //System.out.println( obj.containsAll(obj2));
        /*obj.copyInto(arr);
        for (String string : arr) {
            System.out.print(string+" ");
        }*/
        //System.out.println(obj.elementAt(0));
        /*obj.ensureCapacity(20);
        System.out.println(obj.capacity());*/
        //System.out.println(obj.equals(obj2));
        //System.out.println(obj.firstElement());
        //System.out.println(obj.get(5));
        //System.out.println(obj.indexOf("K"));
        //obj.insertElementAt("Alphabet",0);
        /*Iterator<String> kobj = obj.iterator();
        while (kobj.hasNext()) {
            System.out.print(kobj.next()+" ");
        }*/
        //System.out.println(obj.lastElement());
        //System.out.println(obj.lastIndexOf("L"));
        /*ListIterator<String> lobj = obj.listIterator();
        while (lobj.hasNext()) {
            System.out.print(lobj.next()+" ");
        }*/
        /*obj.remove(1);
        obj.remove("A");
        System.out.println(obj);*/
        /*obj.removeAll(obj);
        System.out.println(obj);*/
        /*obj.removeAllElements();
        System.out.println(obj);*/
        /*obj.removeElement("M");
        System.out.println(obj);*/
        /*obj.removeElementAt(1);
        System.out.println(obj);*/
        //Collections.replaceAll(obj, "A", "Z");
        //obj.retainAll(obj2);
        //obj.set(0, "Alphabets = ");
        //obj.setElementAt("Alphabets = ", 0);
        //obj.setSize(20);
        //System.out.println(obj.size());
        //Collections.sort(obj);
        //System.out.println(obj.subList(0, 10));
        //obj.trimToSize();
        //System.out.println(obj.toString());
        //System.out.println(obj.toArray());
        






        System.out.println(obj);
    }
}