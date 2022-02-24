package assignment8;

public class program43 {
    public static void main(String[] args) {
        int arr[]=new int[]{3,5,7,9,2};
        int find=6;
        Boolean flag= false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("element is found");
        }
        else{
            System.out.println("element is not found");
        }
    }
    
}
