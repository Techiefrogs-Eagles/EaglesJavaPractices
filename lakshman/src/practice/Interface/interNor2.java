package practice.Interface;

 abstract public class interNor2 extends interNor1
{

    abstract void interN21();

    public void display21() {
        System.out.println("in inter2 display21");   
    }
    public String display22() {
        System.out.println("in inter2 display22");
        return "display22";
    }
    public void display11() {
        System.out.println("in inter1 display11");
    }
    public String display12() {
        System.out.println("in inter1 display12");
        return "display12";
    }
    public void display51() {
        System.out.println("in inter5 display51");  
    }
    public String display52() {
        System.out.println("in inter5 display52");
        return "display52";
    }
    public void display31() {
        System.out.println("in inter3 display31");
    }
    void displayN11() {
        System.out.println("in interNor1 displayN11");
    }

    public void fan(){
        System.out.println("in fan internor2");
    }
    

}
