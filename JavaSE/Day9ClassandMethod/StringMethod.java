package JavaSE.Day9ClassandMethod;

public class StringMethod {
    public static void main(String[] args) {
        // String Immutable ( Copy the original ) -> ( Return New String )
        String name = "Tom&Jerry";
        // String Length
        System.out.println("String Length = " + name.length());
        // Character At ( Last Character )
        System.out.println("CharAt = " + name.charAt(name.length() - 1));

        // Upper Case
        // String Immutable ( Copy the original ) -> ( Return New String )
        System.out.println("Upper Case = " + name.toUpperCase());
        String sample = "TOM&JERRY";
        String nameReturn = name.toUpperCase();
        // Check the reference equality
        System.out.println("Check reference Sample and NameReturn is equal = " + (sample == nameReturn));

        // Lower Case
        System.out.println("Lower Case = " + name.toLowerCase());

        // Substring ( Similar as Slicing a slice )
        // Not Include Begin Index
        System.out.println("Substring Begin= " + name.substring(4));

        // Begin and End
        System.out.println("Substring Begin and End = " + name.substring(0, 4));

        // Concat
        System.out.println("Concat = " + name.concat("Cartoon"));

        // Repeat
        System.out.println("Repeat = " + name.repeat(5));

        // Replace
        System.out.println("Replace = " + name.replace("&", " and "));

        // Split // Return String Array
        String[] xs = name.split("&");
        for (String v : xs) {
            System.out.println("Value = " + v);
        }
    }
}
