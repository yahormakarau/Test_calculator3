package junit5.tests;

import org.junit.*;

public class ConditionsTest {
    @Before
    public void testBeforeEachMethod(){
        System.out.println("I'm before each method");
    }
    @BeforeClass
    public static void testBeforeClass(){
        System.out.println("I'm before class");
    }
    @Test(expected = ArithmeticException.class)
    public void testExpectedException(){
        System.out.println("Test1");
    }
    @Test()
    public void testCalculation(){
        System.out.println("Test2");
    }

    @After
    public void testAfterEachMethod(){
        System.out.println("I'm after each method");
    }
    @AfterClass
    public static void testAfterClass(){
        System.out.println("I'm after class");
    }
}
