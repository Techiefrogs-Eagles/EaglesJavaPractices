package KSSPractise;



 class A {
    protected void display()
    {
        System.out.println("GeeksforGeeks");
    }
}
 class B extends A {
     public static void main(String[] args) {
         B obj = new B();
         obj.display();
     }
 }
