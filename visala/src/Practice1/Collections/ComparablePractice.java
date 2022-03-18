package src.Practice1.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparablePractice  {
         public static void main(String[] args) {
         ArrayList<Student> A=new ArrayList<>();
         A.add(new Student(3,"siva","Atlanta"));
         A.add(new Student(9,"Tarak","Texas"));
         A.add(new Student(6, "Mokshitha", "Denver"));

        Collections.sort(A);
        Iterator<Student> itr=A.iterator();
        while(itr.hasNext())
         {
             Student S1=itr.next();
             System.out.println(S1.RollNo+" "+S1.Address+" "+S1.Name);
             
         }
         
     }
}
 class Student implements Comparable<Student>{
         int RollNo;
         String Name;
         String  Address;
         Student(int RollNo,String Name,String Address)
         {
             this.RollNo=RollNo;
             this.Name=Name;
             this.Address=Address;
         }
  
        public int compareTo(Student S) {
           if(RollNo == S.RollNo){
            return 0;
           }
           else if(RollNo >S.RollNo){
           
               return 1;
           }
           else {
               return -1;
           }
           

        }
    }

       