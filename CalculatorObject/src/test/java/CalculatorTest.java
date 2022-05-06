import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class CalculatorTest {
// Using Test code from CalculatorTest class assignment.



Calculator calc;

    @Before
    public void setUp() {
            calc = new Calculator();
        }


        //    Tests for Integers

    @Test
    public void addUsingTwoIntegers() {


        assertEquals(2, calc.add(1, 1));
        assertEquals(10, calc.add(6, 4));
        assertEquals(20, calc.add(13, 7));

    }

    @Test
    public void subtractUsingTwoIntegers() {

        assertEquals(4, calc.subtract(9,5));
        assertEquals(11, calc.subtract(20,9));
        assertEquals(8, calc.subtract(15, 7));
    }

    @Test
    public void multiplyUsingTwoIntegers(){

        assertEquals(9, calc.multiply(3,3));
        assertEquals(6, calc.multiply(2,3));
        assertEquals(96, calc.multiply(12,8));
    }

    @Test
    public void divideUsingTwoIntegers(){

        assertEquals(2, calc.divide(8,4));
        assertEquals(10, calc.divide(100, 10));
        assertEquals(9, calc.divide(54,6));
    }

//    Tests for Doubles
    @Test
    public void addUsingTwoDoubles() {

        assertEquals(21.8, calc.add(13.2,8.6),.01);
        assertEquals(11.37, calc.add(6.56,4.81),.01);
        assertEquals(18.2, calc.add(9.5,8.7),.01);

    }
    @Test
    public void subtractUsingTwoDoubles(){

        assertEquals(4.6, calc.subtract(12.1, 7.5), .01);
        assertEquals(11.7, calc.subtract(32.40, 20.7), .01);
        assertEquals(.02, calc.subtract(6.3, 6.28), .01);
    }

    @Test
    public void multiplyUsingTwoDoubles(){

        assertEquals(274.32, calc.multiply(12.7, 21.6), .01);
        assertEquals(22, calc.multiply(8.8, 2.5), .01);
        assertEquals(107.73, calc.multiply(17.1, 6.3), .01);
    }

    @Test
    public void divideUsingTwoDoubles(){

        assertEquals(4.08, calc.divide(10.2, 2.5), .01);
        assertEquals(3.3, calc.divide(9.9,3 ), .01);
        assertEquals(3.95, calc.divide(15.8, 4), .01);
    }


   }