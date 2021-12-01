package junit5.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
// можно еще использовать methodSorters.JVM or .defauls
public class OrderedTests {
    @Test()
    public void testC(){
        System.out.println("TestC");
    }
    @Test()
    public void testA(){
        System.out.println("TestA");
    }
    @Test()
    public void testB(){
        System.out.println("TestB");
    }
}
