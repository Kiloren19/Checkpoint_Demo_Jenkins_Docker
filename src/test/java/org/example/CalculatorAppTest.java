package org.example;

import static org.testng.AssertJUnit.assertTrue;

import org.junit.Test;
import org.testng.Assert;

public class CalculatorAppTest {
    CalculatorApp calculator = new CalculatorApp();

    @Test
    public void testAddition() {
        Assert.assertEquals(calculator.add(3, 5), 8);
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(calculator.subtract(10, 4), 6);
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(calculator.multiply(2, 6), 12);
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(calculator.divide(10, 2), 5);
    }

}
