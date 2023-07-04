package JavaSE.Day16Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    String message() default "Tom";
}

class DemoClass {
    @MyAnnotation
    void method() {
        System.out.println("Demo Method");
    }

    void another(String msg) {
        System.out.println("Another method");
    }
}
public class CustomAnnotation {
    public static void main(String[] args) {
        DemoClass x = new DemoClass();
        Class<? extends DemoClass> y = x.getClass(); // get class
        System.out.println("Class name: "+y.getName()); // get class name

        // Print Method
        Method[] methods = y.getDeclaredMethods(); // get declared methods, return Method array ( Method[] )
        // Use Reflection
        for (Method m: methods) {
            System.out.println("Declared Methods: "+m);
            System.out.println("Declared Method's name: "+m.getName());
            System.out.println("Declared Method's return type: "+m.getReturnType());

            Class<?>[] parameters = m.getParameterTypes();
            for (Class p: parameters) {
                System.out.println("Parameters: "+p.getName()+" Parameter Type: "+p.getTypeName());
            }

            System.out.println("---------ANNOTATIONS---------");
            Annotation[] annotations = m.getAnnotations();
            for (Annotation n: annotations) {
                System.out.println("Annotation: "+n);
                if (n instanceof MyAnnotation xx) {
                    System.out.println("Data Message: "+xx.message());
                }
            }

            MyAnnotation n = m.getAnnotation(MyAnnotation.class);
            System.out.println("MyAnnotation: "+n);
            System.out.println("----------------------------------------------------");
        }
    }
}
