package src.Revision.Collection;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import src.Practice1.Practice.delimiter;

public class Enum1 {
    enum months {
        January, february, march, april, may, june, july, august, september, october, november, december
    }

    class practice {

        public static void main(String[] args) {
            months m = months.december;
            switch (m) {
                case January -> System.out.println("This is 1st month ");
                case february -> System.out.println("This is 2nd month ");
                case march -> System.out.println("This is 3rd month ");
                case april -> System.out.println("This is 4th month ");
                case may -> System.out.println("This is 5th month ");
                case june -> System.out.println("This is 6th month ");
                case july -> System.out.println("This is 7th month ");
                case august -> System.out.println("This is 8th month ");
                case september -> System.out.println("This 9th  month ");
                case october -> System.out.println("This is 10th month ");
                case november -> System.out.println("This is 11th month ");
                case december -> System.out.println("This is 12th month ");
                default -> System.out.println("invalid");
            }
            months[] m1 = months.values();
            for (months M : m1) {
                System.out.println(M.ordinal() + "..." + M);

            }

        }

    }

}
