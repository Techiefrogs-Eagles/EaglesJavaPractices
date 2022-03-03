package practice.Miscellaneous;

public class constructer 
{
    String employeeName;
    int employeeID;
    int basicSalary;
    int overtimeSalary;
    int TravelAllowance;
    int LossOfPay;
    int deductionPercentage;
    int deduction;
    int TakeHome;

    constructer()
    {
        employeeName = "please enter employee name and try again";
        employeeID = 00000;
        basicSalary = 25000;
        overtimeSalary = 0;
        TravelAllowance = 0;
        LossOfPay = 0;
        deductionPercentage = 10;
        deduction = (basicSalary/100)*deductionPercentage;
        TakeHome = basicSalary+overtimeSalary+TravelAllowance-LossOfPay-deduction;
    }
    public static void main(String[] args) 
    {
        constructer employee1 = new constructer();
        employee1.employeeName = "Lakshman";
        employee1.employeeID = 00001;
        employee1.basicSalary = 35000;
        employee1.TravelAllowance = 1600;
        employee1.LossOfPay = 700;
        employee1.deductionPercentage = 11;
        employee1.deduction = (employee1.basicSalary/100)*employee1.deductionPercentage;
        employee1.TakeHome = employee1.basicSalary+employee1.overtimeSalary+employee1.TravelAllowance-employee1.LossOfPay-employee1.deduction;
        System.out.println("employee ID  "+employee1.employeeID);
        System.out.println("employee Name  "+employee1.employeeName);
        System.out.println("Salary  "+employee1.TakeHome);
        System.out.println();

        constructer employee2 = new constructer();
        employee2.employeeName = "Varma";
        employee2.employeeID = 00002;
        employee2.basicSalary = 30000;
        employee2.TravelAllowance = 1200;
        employee2.LossOfPay = 200;
        employee2.deductionPercentage = 10;
        employee2.deduction = (employee2.basicSalary/100)*employee2.deductionPercentage;
        employee2.TakeHome = employee2.basicSalary+employee2.overtimeSalary+employee2.TravelAllowance-employee2.LossOfPay-employee2.deduction;
        System.out.println("employee ID  "+employee2.employeeID);
        System.out.println("employee Name  "+employee2.employeeName);
        System.out.println("Salary  "+employee2.TakeHome);
        System.out.println();

        constructer employee3 = new constructer();
        employee3.employeeName = "Bhaskar";
        employee3.employeeID = 00003;
        employee3.TravelAllowance = 1000;
        employee3.deductionPercentage = 8;
        employee3.deduction = (employee3.basicSalary/100)*employee3.deductionPercentage;
        employee3.TakeHome = employee3.basicSalary+employee3.overtimeSalary+employee3.TravelAllowance-employee3.LossOfPay-employee3.deduction;
        System.out.println("employee ID  "+employee3.employeeID);
        System.out.println("employee Name  "+employee3.employeeName);
        System.out.println("Salary  "+employee3.TakeHome);
        System.out.println();

        // new joining so default salary structure
        constructer employee4 = new constructer();
        employee4.employeeName = "Venkat";
        employee4.employeeID = 00004;
        System.out.println("employee ID  "+employee4.employeeID);
        System.out.println("employee Name  "+employee4.employeeName);
        System.out.println("Salary  "+employee4.TakeHome);
    }
}
