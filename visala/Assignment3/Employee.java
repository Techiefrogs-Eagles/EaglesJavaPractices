package Assignment3;

public class Employee {
    String name;
    String year;
    String salary,address;


    Employee()
    {
       // System.out.println("employe details");
    
    }
     public static void main(String[] args) {
        Employee detail=new Employee();
        detail.name= "Name";
        detail.year="Year";
        detail.salary="Salary";
        detail.address="Adress";
   System.out.println(detail.name+ "   "+detail.year+"   "+detail.salary+"   " +detail.address);

    Employee detail1=new Employee();
     detail1.name= "Robert";
     detail1.year="1994";
     detail1.salary="64C";
     detail1.address="WallsStreat";
System.out.println(detail1.name+ "  "+detail1.year+"   "+detail1.salary+"   " +detail1.address);

Employee detail2=new Employee();
detail2.name= "Sam";
detail2.year="2000";
detail2.salary="68D";
detail2.address="WallsStreat";
System.out.println(detail2.name+ "   "+detail2.year+"  "+detail2.salary+"   "+detail2.address);

Employee detail3=new Employee();
detail3.name= "John";
detail3.year="1999";
detail3.salary="26B";
detail3.address="WallsStreat";
System.out.println(detail3.name+ "   "+detail3.year+"   " +detail3.salary+"   " +detail3.address);
  
}
}
