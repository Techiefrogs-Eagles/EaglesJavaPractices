package Assignment12LinkedList;


import java.util.LinkedList;

public class Prg12 
{
    public static void main(String[] args) 
    {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");

        obj.remove(1);

        for (String str : obj)
        {
            System.out.println(str);
        }

    }
}
