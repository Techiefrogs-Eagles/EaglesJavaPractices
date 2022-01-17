public class csswitch 
{
    public static void main(String[] args) 
    {
        int k = 30;

        switch(k + 10)
        {
            case 10,40:
            System.out.println("in case 10,40");
            break;
            case 20,50:
            System.out.println("in case 20,50");
            break;
            case 30,60:
            System.out.println("in case 30,60");
            break;
            default:
            System.out.println("undefined");
        }

        String output = switch(k+30)
        {
            case 20:
            System.out.println("2nd switch 20");
            yield "true";
            case 40:
            System.out.println("2nd switch 40");
            yield "true1";
            case 60:
            System.out.println("2nd switch 60");
            yield "true2";
            default:
            System.out.println("2nd switch not found");
            yield "false";

        };
        System.out.println(output);

        int itemcode = 1;
        String text = switch(itemcode) 
        {
            case 001 : 
                yield "It's a laptop!";
            case 002 :
                yield "It's a desktop!";        
            case 003 :
                yield "It's a mobile phone!";
             default :
                yield "unknown item";
        };
        System.out.println(text);

        int csswitch = 20;
        String arrowtest = switch(csswitch)
        {
            case 20 -> 
            { 
                System.out.println("2nd switch 20");
                yield "true";
            }
            case 40 -> 
            {
                System.out.println("2nd switch 40");
            yield "true1";
            }
            case 60 -> 
            {
                System.out.println("2nd switch 60");
                yield "true2";
            }
            default -> 
            {
                System.out.println("2nd switch not found");
                yield "false";
            }
        };
        System.out.println(arrowtest);

    }
    
}
