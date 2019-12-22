package com.techmisal.easy;

import org.junit.Assert;
import org.junit.Test;

public class ParenthesesTest {


    Parentheses parentheses = new Parentheses();


    @Test
    public void testParentheses(){


        Assert.assertTrue(parentheses.getValidParanthenses(""));
        Assert.assertTrue(parentheses.getValidParanthenses("()()()[]{}{}{}"));
        Assert.assertTrue(parentheses.getValidParanthenses("[({})]"));
        Assert.assertFalse(parentheses.getValidParanthenses("{[)}"));
        Assert.assertFalse(parentheses.getValidParanthenses("alksfjsklfjslkj"));
        Assert.assertFalse(parentheses.getValidParanthenses("342441341341341"));


    }


}
