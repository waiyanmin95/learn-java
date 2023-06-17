package JavaSE.Day9ClassandMethod;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Tom";
        System.out.println("Check String instanceof = " + (name instanceof String));

        String demo = "Tom";
        // Check the reference equality
        System.out.println("Check reference Name and Demo is equal = " + (name == demo));

        // Check the content equality
        System.out.println("Check content Name and Demo is equal = " + name.equals(demo));

        // Check the reference equality again
        String name2 = new String("Tom");
        System.out.println("Check reference Name and New Name2 is equal = " + (name == name2));

        // Avoid Null Pointer Exception
        boolean same = "Tom".equals(name);
        System.out.println("Same = " + same);

        // String Concat
        String name3 = "To" + "m";
        System.out.println("Name3 = " + name3);
        // Check the reference equality for String Concat
        System.out.println("Check reference Name and Name3 is equal = " + (name == name3));


        String name4 = "To" + new String("m");
        System.out.println("Name4 = " + name4);
        // Check the reference equality for String Concat New
        System.out.println("Check reference Name and New Name4 is equal = " + (name == name4));

        same = "Tom".equals(name4);
        System.out.println("Same = " + same);
    }
}
