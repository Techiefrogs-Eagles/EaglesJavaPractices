package practice.NestedClass;

public class ReferenceForSNC {
    int i = 10;

    void hello11()
    {
        System.out.println("in hello 11");
        class MethodLocalInnerClasses11
        {
            static void hello21()
            {
                System.out.println("in hello 21");
                abstract class MethodLocalInnerClasses21
                {
                    abstract void hello61();
                    void hello31()
                    {
                        System.out.println("in hello 31");
                        final class MethodLocalInnerClasses51
                        {
                            void hello71()
                            {
                                System.out.println("in hello 71");
                            }

                            void abn1() {
                                System.out.println("in static class, method abn1"); 
                            }        
                        }
                        MethodLocalInnerClasses51 obj51 = new MethodLocalInnerClasses51();
                        obj51.hello71();
                        obj51.abn1();
                    }
                }
                MethodLocalInnerClasses21 obj21 = new MethodLocalInnerClasses21()
                {
                    final void hello61() 
                    {
                        System.out.println("in hello 61"); 
                    }
                };
                obj21.hello31();
                obj21.hello61();
            }
        }
        // MethodLocalInnerClasses11 obj11 = new MethodLocalInnerClasses11();
        MethodLocalInnerClasses11.hello21();
    }

    interface Normal512
                    {
                        void n512();
                        static void s512()
                        {
                            System.out.println("in static class, method s512");
                        }           
                    }
                    

    ReferenceForSNC()
    {
        interface MethodLocalInnerClasses31
        {
            int k = 1000;
            void hello81();
            static void hello41()
            {
                System.out.println("in hello 41");
                class MethodLocalInnerClasses41
                {
                    void hello51()
                    {
                        System.out.println("in hello 51");
                    }
                }
                MethodLocalInnerClasses41 obj41 = new MethodLocalInnerClasses41();
                obj41.hello51();
            }
        }
        MethodLocalInnerClasses31 obj31 = new MethodLocalInnerClasses31()
        {
            public void hello81()
            {
                System.out.println("in hello 81");
                class MethodLocalInnerClasses61
                {
                    void hello91()
                    {
                        System.out.println("in hello 91");
                    }
                }
                MethodLocalInnerClasses61 obj61 = new MethodLocalInnerClasses61();
                obj61.hello91();
            }
        };
        MethodLocalInnerClasses31.hello41();
        obj31.hello81();
        System.out.println(MethodLocalInnerClasses31.k);
    }

    public static void main(String[] args) 
    {
        ReferenceForSNC obj1 = new ReferenceForSNC();
        obj1.hello11();
        Normal512 objin = new Normal512()
                    {

                        public void n512() 
                        {
                            System.out.println("in static class, method n5");
                        }
                    };
                    objin.n512();
                    Normal512.s512();
    }
}
