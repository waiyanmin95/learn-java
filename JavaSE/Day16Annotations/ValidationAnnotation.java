package JavaSE.Day16Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface NotNull {
    String message() default "Field should not be null";
}

class Human {
    @NotNull
    String name;

    String address;
}

class Another {
    @NotNull(message = "Something should not be null")
    String something;

    //@NotNull
    void method() {
    }
}

class Validator {
    static void validate(Object object) {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field Name: " + field.getName());
            System.out.println("Field Type: " + field.getType());

            NotNull getAnnotation = field.getAnnotation(NotNull.class);
            System.out.println(getAnnotation);
//            if (notNull != null) {
//                //System.out.println("Not Null");
//                try {
//                    Object value = field.get(object);
//                    if (value == null) {
//                        System.err.println("Field " + field.getName() + " is null " + notNull.message());
//                    }
//                } catch (IllegalArgumentException ex) {
//                    ex.printStackTrace();
//                } catch (IllegalAccessException ex) {
//                    ex.printStackTrace();
//                }
//            }
            System.out.println("------------------------");
        }
    }
}

public class ValidationAnnotation {
    public static void main(String[] args) {
        Human obj = new Human();
        //obj.name = "";

        Validator.validate(obj);

        Another another = new Another();
        Validator.validate(another);
    }
}
