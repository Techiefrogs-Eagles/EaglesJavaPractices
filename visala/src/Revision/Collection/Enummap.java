package src.Revision.Collection;

import java.util.EnumMap;

public class Enummap {
    enum weeks {
        SUNDAY, Monday, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        EnumMap<weeks, Integer> eobj = new EnumMap<>(weeks.class);
        eobj.put(weeks.TUESDAY, 3);
        eobj.put(weeks.SUNDAY, 1);
        eobj.put(weeks.Monday, 2);
        eobj.put(weeks.FRIDAY, 6);
        eobj.put(weeks.WEDNESDAY, 4);
        eobj.put(weeks.THURSDAY, 5);
        eobj.put(weeks.SATURDAY, 7);

        System.out.println(eobj);
        System.out.println(eobj.containsKey(weeks.FRIDAY));
        System.out.println(eobj.containsValue(1));
        System.out.println(eobj.size());
        weeks w = weeks.FRIDAY;
        switch (w) {
            case Monday -> System.out.println("1st day");
            case TUESDAY -> System.out.println("2nd day");

            case WEDNESDAY -> System.out.println("3rd day");

            case THURSDAY -> System.out.println("4th day");

            case FRIDAY -> System.out.println("5th day");

            case SATURDAY -> System.out.println("6th day");

            case SUNDAY -> System.out.println("7th day");
            default -> System.out.println("invalid");

        }
    }
}
