

public class Employee {
       
    int Year;
    String Name;
    String Address;
    public static void main(String[] args) {
        
        System.out.println("Name  Year    Address");
        Employee employee1 = new Employee();
        employee1.Name="Robet";
        employee1.Year=1994;
        employee1.Address="64C-Wallstreet";
        System.out.println(employee1.Name+"  "+employee1.Year+"  "+employee1.Address);

        Employee employee2 = new Employee();
        employee2.Name="Sam";
        employee2.Year=2000;
        employee2.Address="68D-Wallstreet";
        System.out.println(employee2.Name+"    "+employee2.Year+"  "+employee2.Address);

        Employee employee3 = new Employee();
        employee3.Name="John";
        employee3.Year=1999;
        employee3.Address="26B-Wallstreet";
        System.out.println(employee3.Name+"   "+employee3.Year+"  "+employee1.Address);
    }
    
}
