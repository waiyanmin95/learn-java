package turing.JavaSE.Day9ClassandMethod;

public class StringMutable {
    public static void main(String[] args) {
        // StringBuilder -> Mutable
        StringBuilder builder = new StringBuilder("Tommy");
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            builder.append(" How Are You!");
        }

        System.out.println("Builder = " + builder);
        System.out.println("Check Builder instanceof ? " + (builder instanceof StringBuilder));

        long end = System.currentTimeMillis();
        long timetaken = end - start;
        System.out.println("Time Taken = " + timetaken + "ms");
    }
}
