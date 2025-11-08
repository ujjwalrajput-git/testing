package javaTopics;

import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface coforge {
    String value() default "hello";
}

public class P13_Annotation {

    @coforge(value = "this is value")
    public void show() {
    }

    public static void main(String[] args) throws Exception {
        Method method = P13_Annotation.class.getMethod("show");
        coforge annotation = method.getAnnotation(coforge.class);
        System.out.println(annotation.value()); // Directly prints the value
    }
}
