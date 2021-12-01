package junit5.tests;

import junit5.runners.ExampleRunner;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;


@RunWith(ExampleRunner.class)
@FixMethodOrder(MethodSorters.DEFAULT)

public class BasicJunitTest {
    @Test
    public void testAssertTrueExample(){
    assertTrue(5>3);
    }
    @Test
    public void testAssertFalseExample(){assertFalse(5<3);};

    @Test
    public void testComparingStrings(){assertEquals("a","c");}

    @Test(expected = ArithmeticException.class)
    public void testExpectedException(){
        double a = 5 / 0;
        assertEquals(0, a, 0);
    }

    @Test(timeout = 1)
    public void testWithoutExpectedException() throws InterruptedException{
        Thread.sleep(40);
    }
}
