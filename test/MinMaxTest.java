import static org.junit.Assert.*;
import main.*;
import org.junit.Test;

public class MinMaxTest {
    @Test
    public void TC1(){
        MinMax m1 = new MinMax();
        int []array1 = {0,2,10,8,5,6};
        int []expected = {0,10};
        assertArrayEquals(expected, m1.findMinAndMax(array1));
    }
    @Test
    public void TC2(){
        MinMax m1 = new MinMax();
        int []array1 = {10,23,3,-4,-7,6};
        int []expected = {-7,23};
        assertArrayEquals(expected, m1.findMinAndMax(array1));
    }
    @Test
    public void TC3(){
        MinMax m1 = new MinMax();
        int []array1 = {9,6352,553,4666,56,1};
        int []expected = {1,6352};
        assertArrayEquals(expected, m1.findMinAndMax(array1));
    }

    @Test
    public void TC4(){
        MinMax m1 = new MinMax();
        int []array1 = {-9999,-200,-443,-200,-3,-328};
        int []expected = {-9999,-3};
        assertArrayEquals(expected, m1.findMinAndMax(array1));
    }
    @Test
    public void TC5(){
        MinMax m1 = new MinMax();
        int []array1 = {8};
        int []expected = {8,8};
        assertArrayEquals(expected, m1.findMinAndMax(array1));
    }
}