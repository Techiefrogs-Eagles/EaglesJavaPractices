public class MethodsinEnum {
    enum Level {
     Pass,
     Average,
     Fail,
     Distint
    }
  
    public static void main(String[] args) {
      Level enumset = Level.Pass; 
    /* switch(enumset){
      case Average:
      System.out.println("He Secure Average Marks");
     break;
     case Distint:
     System.out.println("He got Distint in Academic Year");
     break;
     case Pass:
     System.out.println("He pass");
     break;
     }*/


     for (Level enumset : Level.values()) {
      System.out.println(enumset);
     }


      //System.out.println(enumset);
    }
  }