package Practice.Interface.NestedClasses;

public class Outer {
    int i;
     class Inner{
        int v=9;
         void method(){};
       // Outer Ok=new Outer();
        //Outer.Inner Inn=Ok.new Inner();
       
        public class LocInner{
            public  static void main(String[] args) {
                Outer Ou=new Outer();
                Ou.i=7;
                Outer.Inner Inn=Ou.new Inner(){
                    int b=8;
                    
                    void method(){
                        System.out.println(b);
                    }
                    
                };
                Inn.v=56;
                
                System.out.println(Ou.i+" "+Inn.v);
                
                
                
            }
        }
    }
}
