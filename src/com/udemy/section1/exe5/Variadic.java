package section1.exe5;

public class Variadic {
    public void Exec5Method(String... strings) {
        for (String str: strings) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Variadic exe5 = new Variadic();
        exe5.Exec5Method("GG", "EZ", "TOM", "JERRY");
        System.out.println("=====");
        exe5.Exec5Method("Hello", "World", "Java", "SE");
    }
}

