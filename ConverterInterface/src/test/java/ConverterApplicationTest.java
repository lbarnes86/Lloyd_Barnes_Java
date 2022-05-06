import com.company.Converter;
import com.company.ConverterIf;
import com.company.ConverterSwitch;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterApplicationTest {


    private Converter convertIf = new ConverterIf();
    private Converter convertSwitch = new ConverterSwitch();


//    Test for Converter If/Else statements.
    @Test
    public void converterIfMonth() {
        assertEquals("January", convertIf.convertMonth(1));
        assertEquals("February", convertIf.convertMonth(2));
        assertEquals("December", convertIf.convertMonth(12));
    }
    @Test
    public void converterIfDay(){
        assertEquals("Sunday", convertIf.convertDay(1));
        assertEquals("Tuesday", convertIf.convertDay(3));
        assertEquals("Saturday", convertIf.convertDay(7));
    }

//    Tests for Switch statements.

    @Test
    public void converterSwitchMonth() {
        assertEquals("March", convertSwitch.convertMonth(3));
        assertEquals("May", convertSwitch.convertMonth(5));
        assertEquals("October", convertSwitch.convertMonth(10));
    }

    @Test
    public void setConvertSwitchDay() {
        assertEquals("Monday", convertSwitch.convertDay(2));
        assertEquals("Wednesday", convertSwitch.convertDay(4));
        assertEquals("Friday", convertSwitch.convertDay(6));

    }
}

