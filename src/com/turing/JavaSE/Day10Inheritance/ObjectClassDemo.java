package JavaSE.Day10Inheritance;

// Definition from line 27 Imported Here

import java.util.ArrayList;
import java.util.List;

// All other classes are SubClasses of Object
class Root extends Object {
    final void DoSomthing() {
        System.out.println("Do Something Please.");
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Root me = new Root();
        me.DoSomthing();
        System.out.println(me.getClass());

        // Same Package > Default Access Usage
        Human h = new Doctor();
        h.work();
        System.out.println(me.getClass());

        // Import Different
        List<String> stringList = new ArrayList<String>();
    }
}
