package Assignment8.StringExcersises;

public class Program2 
{
    public void method(String[] str) 
    {
      for(int i = 0; i < str.length; i++)
      {
          for(int j = i+1; j < str.length; j++) 
          {
            if(str[i].compareToIgnoreCase(str[j])>0) 
            {
             String count = str[i];
             str[i] = str[j];
             str[j] = count;
            }
          }
      }
       for (String str1 : str)
       {
           System.out.println(str1);
       }

    }
    public static void main(String[] args) {
            
        String[] str2 = {"Butterflies","Sparrows","Rabbits","Pegions"};
        Program2 obj = new Program2();
        obj.method(str2);
    }
}
