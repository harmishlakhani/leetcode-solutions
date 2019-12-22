package com.techmisal.easy;


import org.junit.Assert;

public class MiddleElementTest {


    MiddleElement middleElement = new MiddleElement();

    public void testMiddleElement() {

        ListNode node = new ListNode(1);

        node.next = new ListNode(2);
        node.next.next = new ListNode(3);



        Assert.assertEquals(2,middleElement.middleNode(node).val);

    }

}
