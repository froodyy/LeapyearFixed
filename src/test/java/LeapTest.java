import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapTest {
    @Test
    void testIfYear2000IsLeapYearEqualsTrue(){
        var CalenderTester = new Kalender();
        assertTrue(CalenderTester.isLeapYear(2000)); // denne skal gi true
    }
    @Test
    void testIfYear2004IsLeapYearEqualsTrue(){
        var ClenderTester = new Kalender();
        assertTrue(ClenderTester.isLeapYear(2004)); // denne skal gi true
    }
    @Test
    void testIfYear2008IsLeapYearEqualsTrue(){
        var CalenderTester = new Kalender();
        assertTrue(CalenderTester.isLeapYear(2008)); // denne skal gi true
    }
    @Test
    void testIfYear1900UIsLeapYearEqualsFalse(){
        var C = new Kalender();
        assertFalse(C.isLeapYear(1900)); // denne skal gi false
    }
    @Test
    void testIfYear2100IsLeapYearEqualsFalse(){
        var dicks = new Kalender();
        assertFalse(dicks.isLeapYear(2100)); // denne skal gi false
    }
}
