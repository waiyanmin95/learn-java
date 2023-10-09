package turing.JavaSE.Day9ClassandMethod;

public class StringImmutable {
    public static void main(String[] args) {
        String name = "Tom";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            name += " Jerry";
        }
        long end = System.currentTimeMillis();
        System.out.println("Name = " + name);

        long timetaken = end - start;
        System.out.println("Time Taken = " + timetaken + "ms");
    }
}
