package practice;

import java.util.Arrays;

public class HackPrac {
    public static void main(String[] args) {
        String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        int z = 144;

        int length = s.length();  
        int temp = 0; 
        String array[] = new String[length-(z-1)];  
  
        for(int i=0; i<length-(z-1); i++) 
        {    
            array[temp] = s.substring(i, i+z);  
            temp++; 
        }
        Arrays.sort(array);
        System.out.println(array[0]+"  "+array[array.length-1]);
    }
}
