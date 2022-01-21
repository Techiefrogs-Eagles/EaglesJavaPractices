public class Students {

    int roll_no;
    String ph_no;
    String name,addres;
  
   Students()
    {
        System.out.println("Student details");
    
    }
     public static void main(String[] args) {
     Students detail=new Students();
     detail.roll_no= 1;
     detail.name="Sam";
     detail.ph_no="4323345322";
     detail.addres="atlanta";
System.out.println(detail.roll_no+ " "+detail.name+" "+detail.ph_no+" " +detail.addres);
  
     Students detail1=new Students();
     detail1.roll_no=2;
     detail1.name="John";
     detail1.ph_no="4234645547";
     detail1.addres="Texas";
     System.out.println(detail1.roll_no+" "+detail1.name+" "+detail1.ph_no+" " +detail1.addres);



     }
    }
