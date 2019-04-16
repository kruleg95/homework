package lesson12.reflection.simpleJunit;

import lesson12.reflection.simpleJunit.annotation.AfterMethod;
import lesson12.reflection.simpleJunit.annotation.BeforeMethod;
import lesson12.reflection.simpleJunit.annotation.Ignore;
import lesson12.reflection.simpleJunit.annotation.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class EJUnitRunner {
    public static void main(String[] args) throws Exception {

        Class<TestClass> testClazz = TestClass.class;

        // create object
        Constructor<TestClass> constructor = testClazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        //instance
        TestClass instance = constructor.newInstance();
        //method
        Method[] methods = testClazz.getDeclaredMethods();


        List<Method> beforeMethods = filterMethods(methods, BeforeMethod.class);
        List<Method> testMethods = filterMethods(methods, Test.class);
        List<Method> afterMethods = filterMethods(methods, AfterMethod.class);


        for (Method testMethod : testMethods) {
            runMethods(instance, beforeMethods);
            runSingleMethods(instance, testMethod);
            runMethods(instance, afterMethods);
        }
    }

    private static void runSingleMethods(Object instance, Method method) {


        try {
            method.invoke(instance);

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void runMethods(Object instance, List<Method> beforeMethods) {
        beforeMethods.stream().forEach(method -> runSingleMethods(instance, method));
    }


    public static List<Method> filterMethods(Method[] methods, Class<? extends Annotation> s) {
        List<Method> filteredMethods = Arrays.stream(methods)
                .filter(method -> method.isAnnotationPresent(s))
                .collect(toList());
        for (int i = 0; i < filteredMethods.size(); i++) {
            if (filteredMethods.get(i).isAnnotationPresent(Ignore.class)) {
                filteredMethods.remove(i);
            }
        }
        return filteredMethods;
    }

}
