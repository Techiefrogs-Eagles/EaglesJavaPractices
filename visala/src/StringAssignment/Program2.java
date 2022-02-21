package src.StringAssignment;

public class Program2 {
    public static void main(String[] args) {
        String[] sarr={"Visala","Laskhmi","Siva","Tarak","Mokshitha"};
      
        for(int i=0;i<sarr.length;i++)
        {
            for(int j=i+1;j<sarr.length;j++)
            {
                if(sarr[i].compareToIgnoreCase(sarr[j])>0)
                {
                    String temp=sarr[i];
                    sarr[i]=sarr[j];
                    sarr[j]=temp;
                }                

            }
           
        }
        for (String s : sarr) 
        {
            System.out.println(s+" ");
        }

    }
    
}
