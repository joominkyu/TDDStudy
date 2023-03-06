package chap02;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {
    @Test
    void test(){
        int result = Calculator.plus(1,2);
        assertEquals(3,result);
        assertEquals(5,Calculator.plus(4,1));
    }
}
