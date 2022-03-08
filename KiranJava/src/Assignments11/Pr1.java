package Assignments11;

import java.util.ArrayList;

public class Pr1 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        colors.add("orange");
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
    }
}
