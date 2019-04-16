package lesson12.reflection.simpleJunit;

import lesson12.reflection.simpleJunit.annotation.AfterMethod;
import lesson12.reflection.simpleJunit.annotation.BeforeMethod;
import lesson12.reflection.simpleJunit.annotation.Ignore;
import lesson12.reflection.simpleJunit.annotation.Test;

public class TestClass {
    @BeforeMethod
    public void init() {
        System.out.println("before method");
    }

    @AfterMethod
    public void clean() {
        System.out.println("after method");
    }

    @Ignore
    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test(expected = NullPointerException.class)
    public void test3() {
        System.out.println("test3");
    }
}
