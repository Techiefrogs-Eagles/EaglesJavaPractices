package practice.NestedClass;

public class RefClass extends StaticNestedClass.static1
{
    public static void main(String[] args) 
    {
        RefClass o = new RefClass();
        RefClass.s1();
        o.n1();
    }
}

class RefClass1 extends StaticNestedClass.static1.Normal1.static2.abstract1
{
    void abn1() 
    {
        System.out.println("in static class,extended method abn1");
        class hello123 extends StaticNestedClass.static1.Normal1.static2
        {
            
        }
        hello123 hobj = new hello123();
        System.out.println(hobj.l+"  "+hello123.jb); 
    }
    public static void main(String[] args) 
    {
        RefClass1 ro = new RefClass1();
        ro.abn1();
        ro.n4();
        RefClass1.s4();
    }
}

class RefClass2
{
    class hai123 implements ReferenceForSNC.Normal512
    {
        void practical()
        {
            class doubt implements ReferenceForSNC.Normal512
            {
                public void n512() 
                {
                    System.out.println("very new");   
                }
            }
            doubt dobj = new doubt();
            dobj.n512();
        }
        public void n512() 
        {
            System.out.println("new");  
        }
    }
    public static void main(String[] args) 
    {
        RefClass2 refobj = new RefClass2();
        RefClass2.hai123 haiobj = refobj.new hai123(); 
        haiobj.n512();
        haiobj.practical();
    }
}
