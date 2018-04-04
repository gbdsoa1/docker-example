package hello;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    @Test
    public void testCalcProduct(){

        Assert.assertEquals(Calculator.product("5","5"), Double.valueOf(25));
    }

    @Test (expected = NumberFormatException.class)
    public void testCalcProductInvalidInput(){
        Calculator.product("5","d");
    }
}

