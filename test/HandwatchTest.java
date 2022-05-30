import main.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class HandwatchTest {
    // Edge coverage
    @Test
    public void TC1(){
        Handwatch n1 = new Handwatch();
        String inputs = "abadacaad";
        String output = "Current state: Normal_Display, the inner state: Time  Date: 1 - 1 - 2000  Time: 00:00";
        assertEquals( output , n1.handwatch(inputs));
    }
    // Edge coverage
    @Test
    public void TC2(){
        Handwatch n1 = new Handwatch();
        String inputs = "cbababababa";
        String output = "Current state: Normal_Display, the inner state: Time  Date: 2 - 2 - 2001  Time: 01:01";
        assertEquals( output , n1.handwatch(inputs));
    }

    // ADUP Testing
    @Test
    public void TC3(){
        Handwatch n1 = new Handwatch();
        String inputs = "cbbabbbaaaa";
        String output = "Current state: Normal_Display, the inner state: Time  Date: 1 - 1 - 2000  Time: 03:02";
        assertEquals( output , n1.handwatch(inputs));
    }
    // ADUP Testing
    @Test
    public void TC4(){
        Handwatch n1 = new Handwatch();
        String inputs = "caabbabbbbabbba";
        String output = "Current state: Normal_Display, the inner state: Time  Date: 3 - 5 - 2003  Time: 00:00";
        assertEquals( output , n1.handwatch(inputs));
    }
}