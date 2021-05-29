package com.generic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindMaxNumTest {

    @Test
    public void givenThreeDoubleNumber_ShouldReturnMaximum() {
        Double a = 1.4;
        Double b = 7.7;
        Double c = 8.7;
        //Constructor that is object initalization.
        MaxNum obj = new MaxNum();
        Double result = (Double) obj.findMax(a, b, c);
        Assert.assertEquals(c, result);
    }
    @Test
    public void givenThreeIntgerNumber_ShouldReturnMaximum() {
        Integer a = 1;
        Integer b = 7;
        Integer c = 9;
        //Constructor
        MaxNum obj = new MaxNum();
        Integer result = (Integer) obj.findMax(a, b, c);
        Assert.assertEquals(c, result);
    }
    @Test
    public void givenThreeCharcater_ShuouldReturnMaximum() {
        Character a = 'x';
        Character b = 'y';
        Character c = 'z';
        //Constructor
        MaxNum obj = new MaxNum();
        Character result = (Character) obj.findMax(a, b, c);
        Assert.assertEquals(c, result);
    }

}

