package JavaSE.Day9ClassandMethod;

class Windows {
    void screenSaver() {
        System.out.println("Original Windows Screen Saver");
    }

    void msWord() {
        System.out.println("Original Microsoft Words");
    }

    void msExcel() {
        System.out.println("Original Microsoft Excel");
    }
}

class Windows98 extends Windows {
    // Method overriding is one of the ways in which Java supports Runtime Polymorphism.
    // Dynamic method dispatch is the mechanism by
    // which a call to an overridden method is resolved at run time, rather than compile time.
    // Method Override | Runtime Polymorphism | Dynamic Method Dispatch
    void msExcel() {
        super.msExcel();
        System.out.println("Windows98 New Feature");
    }
}

public class InheritanceDemo {
    // Reusable, Already Tested by community, Already Improved, More Functional
    // D.R.Y = Don't Repeat Yourself
    // Single Inheritance
    //      Base-Derived
    //      Parent-Child
    //      Super-SubClass
    //      Generic-Specific
    // -------------------------------------
    // Inheritance > Best Practices ( Should Equal Taxonomy )
    public static void main(String[] args) {
        Windows w = new Windows98();
        w.screenSaver();
        w.msWord();
        w.msExcel();
    }
}
