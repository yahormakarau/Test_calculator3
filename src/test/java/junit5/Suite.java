package junit5;

import junit5.tests.BasicJunitTest;
import junit5.tests.OrderedTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@org.junit.runners.Suite.SuiteClasses({BasicJunitTest.class, OrderedTests.class})
class SuiteJ {

}
