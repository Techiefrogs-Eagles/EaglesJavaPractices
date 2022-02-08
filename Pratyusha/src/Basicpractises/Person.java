package Basicpractises;

public class Person {
   String Aadharnum;
   String Name;
   int Age;
   String profession;
   void display() {
       System.out.println("Aadharnum : "+Aadharnum);
       System.out.println("Name : "+ Name);
       System.out.println("Age :"+ Age);
       System.out.println("profession : "+profession);
   }

}
class Information {

    public static void main(String[] args) {
        Person pro = new Person();
        pro.Aadharnum = "989703348521";
        pro.Name = "Nimmy";
        pro.Age = 30;
        pro.profession = "Developer";
        pro.display();

    }
}
