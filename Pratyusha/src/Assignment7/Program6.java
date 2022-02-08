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
            // TODO Auto-generated method stub
            
        }

        @Override
        public void method12() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void method21() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void method22() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void method31() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void method32() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void method4() {
            // TODO Auto-generated method stub
            
        }
         
     }
}
