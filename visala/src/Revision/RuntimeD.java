package src.Revision;

public class RuntimeD {
    private static Object Runtime1;

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();

        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        System.gc();
        System.out.println(r.availableProcessors());
        System.out.println(r.maxMemory());

    }
}
