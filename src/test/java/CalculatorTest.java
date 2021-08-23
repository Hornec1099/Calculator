import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void calculator(){calculator = new Calculator();}

    @Test
    public void calcCanAdd(){
        assertEquals(30, calculator.add(10, 20));
    }
    @Test
    public void calcCanSubtract(){
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    public void calcCanMultiply(){
        assertEquals(20, calculator.multiply(10, 2));
    }
    @Test
    public void calcCanDivide(){
        assertEquals( 5 , calculator.divide( 10, 2));
    }

}
