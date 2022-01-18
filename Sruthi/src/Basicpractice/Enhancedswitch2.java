package Basicpractice;
// while using switch arrows and when we have  multiple statement in code block then use {}
public class Enhancedswitch2 {
    public static void main(String[] args) {
        int i = 20;
        int j = switch(i) {

            case 10 -> {
                        int k = 10;
                        System.out.println(" In case 10 and k is "+k);
                        yield 10;
                        }
            case 20 -> {
                        int k = 30;
                        System.out.println(" In case 20 and k is "+k);
                        yield 20;
                         }
            case 30 -> {
                        System.out.println("In case 30");
                        yield 30;
                        }
            default -> { 
                        System.out.println("default value");
                        yield 0;
                            }
                         }; //A switch block needs to be delimited by a semicolon. 
        System.out.println(" my j value is "+j);
                        }
    
}
