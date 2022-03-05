package Assignment7;

public class Program6 {
     interface I1 {
    void method11();
    void method12();

     }


     interface I2{
    void method21();
    void method22();

     }



     interface I3{
        void method31();
        void method32();
     }

     interface I4 extends I1,I2,I3 {
     
        void method4();

     }

     class I5 implements I4 {

        @Override
        public void method11() {
          
            
        }

        @Override
        public void method12() {
          
            
        }

        @Override
        public void method21() {
            
            
        }

        @Override
        public void method22() {
           
            
        }

        @Override
        public void method31() {
           
        }

        @Override
        public void method32() {
            
        }

        @Override
        public void method4() {
           
        }
         
     }
}
