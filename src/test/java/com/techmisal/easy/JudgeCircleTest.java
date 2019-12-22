package com.techmisal.easy;

import org.junit.Assert;
import org.junit.Test;

public class JudgeCircleTest {

    JudgeCircle jc =new JudgeCircle();


    @Test
    public void testJudgeCircle(){

        Assert.assertEquals(true,jc.judgeCircleMethod("UD"));

    }



}
