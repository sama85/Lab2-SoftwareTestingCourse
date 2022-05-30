import org.junit.Test;
import main.*;

import static org.junit.Assert.*;

public class NumberTypeTest {

    @Test
    public void TC1(){
        NumberType number = new NumberType();
        assertEquals("The number is even", number.isEven(0));
    }
    @Test
    public void TC2(){
        NumberType number = new NumberType();
        assertEquals("The number is odd", number.isEven(1));
    }
    @Test
    public void TC3(){
        NumberType number = new NumberType();
        assertEquals("The number is even", number.isEven(3000));
    }
    @Test
    public void TC4(){
        NumberType number = new NumberType();
        assertEquals("The number is odd", number.isEven(3001));
    }
    @Test
    public void TC5(){
        NumberType number = new NumberType();
        assertEquals("The number is even", number.isEven(-200));
    }
    @Test
    public void TC6(){
        NumberType number = new NumberType();
        assertEquals("The number is odd", number.isEven(-201));
    }
}