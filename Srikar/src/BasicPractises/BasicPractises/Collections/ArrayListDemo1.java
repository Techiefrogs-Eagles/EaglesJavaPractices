package BasicPractises.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList arrList = new ArrayList<>();
        arrList.add("143");
        arrList.add(256);
        arrList.add("Srikar");
        Iterator itr = arrList.iterator();
        while(itr.hasNext()){

        System.out.println(itr.next());
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(916);
        System.out.println(arr.hashCode());
    }
}
