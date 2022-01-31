package Assignment4;

public class Manager extends Member {
String Specialization="java";
String Development="Prpgramer";
    public static void main(String[] args) {
        
    
    Manager mobj=new Manager();
    
        
        mobj.Name="bbb";
        mobj.Age=21;
        mobj.Phno="3213456789";
        mobj.Salary="2100$";
        mobj.Address="Alphreta";
         System.out.println(mobj.Name+" "+mobj.Address+"  "+mobj.Age+" "+mobj.Phno+ "  "+mobj.Salary);
    }
    
}
