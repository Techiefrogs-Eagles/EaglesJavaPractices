package Assignment5;

public class student 
{
    String name;
    int age;
    String address;

    student()
    {
        name = "unknown";
        age = 0;
        address = "Not available";
    }

    void setInfo(String a ,int b)
    {
        name = a;
        age = b;
    }

    void setInfo(String a ,int b , String c)
    {
        name = a;
        age = b;
        address = c;
        System.out.println(name+"  "+age+"  "+address);
    }

    public static void main(String[] args) {
        student sobj = new student();
        sobj.setInfo("lakshman", 24, "rajahmundry");
    }

}