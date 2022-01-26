package Encapsulation;

public class encapdemo {
    public static void main(String[] args) {
        EncapsulationDemo encapdemo = new EncapsulationDemo();
        encapdemo.setname("James");
        encapdemo.setIdnum("88970");
        encapdemo.setAge(25);
        encapdemo.setPercentage(25.80f);
        System.out.println("Name:" + encapdemo.getname());
        System.out.println(" Age : " + encapdemo.getAge());
        System.out.println("Idnum: " + encapdemo.getIdnum());
        System.out.println("Percentage: " + encapdemo.getPercentage());

    }
}
