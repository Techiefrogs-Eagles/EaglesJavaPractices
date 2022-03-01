package Basicpractises;

public class app {
    int num;
    void display() {
        System.out.println("Num = "+num);
    }
}

class Main{
    public static void main(String[] args) {
        app obj = new app();
        obj.num = 9;
        obj.display();
    }
}

