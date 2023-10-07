package JavaSE.Day15Enum;

enum Gender {
    // An enumeration is a list of named constants
    // that define a new data type and its legal values
    MALE, FEMALE // Note that they should be in uppercase letters:

    // An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
    // To create an enum, use the enum keyword (instead of class or interface),
    // and separate the constants with a comma.
}

enum Color {
    RED,
    GREEN,
    BLUE
}
//  Enum is short for "enumerations", which means "specifically listed".
// Java Enumerations Are Class Types

public class EnumDemo {
    public static void main(String[] args) {
        Gender person = Gender.FEMALE;
        System.out.println("This person is a " + person);

        person = Gender.MALE;
        System.out.println("This person is a " + person);

        // Can't assign/change value
        // Color.RED = Color.BLUE; // Invalid Operation

        Color base = Color.RED;
        System.out.println("The color is " + base);

        base = Color.GREEN;
        System.out.println("The color is " + base);

        base = Color.BLUE;
        System.out.println("The color is " + base);

        // IF / SWITCH case Valid
        System.out.println("");
        System.out.println("IF ELSE Scenario");
        if (base == Color.BLUE) {
            System.out.println("It's BLUE");
        } else {
            System.out.println("It's not BLUE, may be RED or GREEN");
        }

        System.out.println("");
        System.out.println("SWITCH CASE Scenario");
        base = Color.GREEN;
        switch (base) {
            case RED:
                System.out.println("It's RED");
            case GREEN:
                System.out.println("It's GREEN");
                break;
            case BLUE:
                System.out.println("It's BLUE");
            default:
                System.out.println("It's neither RED nor GREEN nor BLUE");
        }

        System.out.println("------------------");
        System.out.println("TRAVERSE Values Scenario");
        // Traverse Enum values
        for (Color v : Color.values()) {
            System.out.println(v);
        }

        System.out.println("------------------");
        System.out.println("valueof Scenario"); // String to enum
        base = Color.valueOf("GREEN");
        System.out.println("It's " + base);

        /*
        Invalid Operation
        base = Color.valueOf("GREENs");
        System.out.println("It's " + base);
        */
    }
}
