package AnnonymusPractise;

interface Software {
    public void develop();
 }
class Pratyu {
    public static void main(String args[]) {
       Software s = new Software() {
          @Override
          public void develop() {
             System.out.println("Software Developed in Java");
          }
       };
       s.develop();
       System.out.println(s.getClass().getName());
    }
 }
