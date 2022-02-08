package EagleJava;public class P16Armstrong {
    public static void main(String[] args) {
        int n=370,num,temp,t=0;
        num=n;
        while(num != 0)
        {
            temp=num%10;
            t=t+temp*temp*temp;
            num=num/10;
        }
        if(t==n)
         System.out.println(n +" is armstrong number");
        else
        System.out.println(n +" is not armstrong number");
    }
    
}
