package lesson12.reflection.singletonRefelction;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception {
        Singleton instanceOriginal = Singleton.getInstance();

        Class<Singleton> singletonClass = Singleton.class;
        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton instanceReflection = declaredConstructor.newInstance();

        instanceOriginal.setName("Original");
        instanceReflection.setName("Reflection");

        System.out.println(instanceOriginal.getName());
        System.out.println(instanceReflection.getName());

    }
}
