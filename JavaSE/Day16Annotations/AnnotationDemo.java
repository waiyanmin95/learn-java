package JavaSE.Day16Annotations;

class Master {
    void method() {
        System.out.println("Master method");
    }
}

class Slave extends Master {
    @Override
    void method() {
        // super.method(); access super class method
        System.out.println("Slave method");
    }
}
public class AnnotationDemo {
    public static void main(String[] args) {
        Master m = new Slave();
        m.method();
    }
}
