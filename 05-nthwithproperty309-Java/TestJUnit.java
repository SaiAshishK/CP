/**
 * This is JUnit that tests the sleepIn method that is available in SleepIn class.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase4).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
        assertEquals(new NthWithProperty309().nthWithProperty309(0), 309);
        assertEquals(new NthWithProperty309().nthWithProperty309(1), 418);
        assertEquals(new NthWithProperty309().nthWithProperty309(2), 462);
        assertEquals(new NthWithProperty309().nthWithProperty309(3), 474);
   }
   @Test
   public void testCase2() {
        assertEquals(new NthWithProperty309().nthWithProperty309(4), 575);
        assertEquals(new NthWithProperty309().nthWithProperty309(5), 635);
        assertEquals(new NthWithProperty309().nthWithProperty309(6), 662);
        assertEquals(new NthWithProperty309().nthWithProperty309(100), 2014);
   }
   @Test
   public void testCase3() {
        assertEquals(new NthWithProperty309().nthWithProperty309(1000), 7813);
   }
}
