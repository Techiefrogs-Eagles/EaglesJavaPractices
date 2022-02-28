package src.Practice1.Exceptionpractice;

class SchoolException extends Exception
{
   public SchoolException(String s,Throwable a)
   {
   super(s,a);
   }
    public SchoolException(String s){
    super(s);
    }
}
     class ClassException extends Exception
     {
        public ClassException(String s,Throwable a){
        super(s,a);
        }
        public ClassException(String s){
            super(s);
        }
    }
         class SessionException extends Exception{
           
            public SessionException(String s,Throwable a){
                super(s,a);
            }
                public SessionException(String s){
                    super(s);
            }
        }
           
            
        
    public  class ExceptionChaining1
    {
         void Session() throws SessionException
         {
              throw new SessionException("Session closed");
          }
          void Class() throws ClassException
          {
            try{
                Session();
            }
            catch (SessionException Se)
            {
                throw new ClassException("Class Closed",Se);
            }
          }
            void School() throws SchoolException
            {
                try
                {
                    Class();

                }
                catch(ClassException Ce)
                {
                
                  throw new SchoolException("School closed",Ce);
                
                }
            }
          public static void main(String[] args) throws SchoolException
          {
              ExceptionChaining1 EX=new ExceptionChaining1();
              EX.School();
          }
        
    }
    
           
 
