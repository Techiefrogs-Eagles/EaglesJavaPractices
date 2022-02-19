package practice.Interface;

public interface inter2
{
    int a = 20;
    String name = "venkat";

    void display21();

    static private void display23(){
        System.out.println("in private static method");
    }

    String display22();

    public static void main(String[] args){
        inter2.display23();
    }

}
