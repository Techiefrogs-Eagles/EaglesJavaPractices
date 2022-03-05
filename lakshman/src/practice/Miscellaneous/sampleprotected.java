package practice.Miscellaneous;

import practice.AcssesModifiers.protectedMod;

public class sampleprotected extends protectedMod
{

    sampleprotected(){
        super(20);
    }
    public static void main(String[] args) {
        sampleprotected sampobj = new sampleprotected();
        sampobj.display100();
        sampobj.a1 = 10;
    }    
}
