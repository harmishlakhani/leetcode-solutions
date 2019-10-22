package com.techmisal.medium;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.techmisal.medium.CloneGraph.Node;

import org.junit.Test;

public class CloneGraphTest {
    private CloneGraph cloner = new CloneGraph();

    @Test
    public void SingleNode() {
        List<Node> neighbors = new ArrayList<>(0);
        Node node = new Node(2, neighbors);
        Node clone = cloner.cloneGraph(node);
        assertFalse(node == clone);
        assertTrue(clone.neighbors.size() == 0);
    }

    @Test
    public void DoubleNode() {
        List<Node> leftn = new ArrayList<Node>(1);
        List<Node> rightn = new ArrayList<Node>(1);
        Node left = new Node(5, leftn);
        Node right = new Node(24, rightn);
        leftn.add(right);
        rightn.add(left);

        Node leftclone = cloner.cloneGraph(left);
        assertFalse(leftclone == left || leftclone == right);
        assertTrue(leftclone.neighbors.size() == 1);
        assertTrue(leftclone.val == left.val);

        Node rightclone = leftclone.neighbors.get(0);
        assertFalse(rightclone == right || rightclone == left);
        assertTrue(rightclone.neighbors.size() == 1);
        assertTrue(rightclone.neighbors.contains(leftclone));
        assertTrue(rightclone.val == right.val);
    }

    @Test
    public void Square() {
        List<Node> tln = new ArrayList<Node>(2);
        List<Node> trn = new ArrayList<Node>(2);
        List<Node> brn = new ArrayList<Node>(2);
        List<Node> bln = new ArrayList<Node>(2);
        Node tl = new Node(1, tln);
        Node tr = new Node(2, trn);
        Node br = new Node(3, brn);
        Node bl = new Node(4, bln);
        tln.add(tr);
        tln.add(bl);
        trn.add(tl);
        trn.add(br);
        brn.add(tr);
        brn.add(bl);
        bln.add(tl);
        bln.add(br);

        Node clone = cloner.cloneGraph(tl);
        assertFalse(clone == tl || clone == tr || clone == br || clone == bl);
        assertTrue(clone.neighbors.size() == 2);
        assertTrue(clone.val == tl.val);
        Node n2 = clone.neighbors.get(1);

        Node n0 = clone.neighbors.get(0);
        assertFalse(n0 == tl || n0 == tr || n0 == br || n0 == bl);
        assertTrue(n0.neighbors.size() == 2);
        assertTrue(n0.neighbors.contains(clone));
        boolean n0istopright = n0.val == tr.val;
        assertTrue(n0istopright || n0.val == bl.val);
        int next = (n0.neighbors.indexOf(clone) == 0) ? 1 : 0;

        Node n1 = n0.neighbors.get(next);
        assertFalse(n1 == tl || n1 == tr || n1 == br || n1 == bl);
        assertTrue(n1.neighbors.size() == 2);
        assertFalse(n1.neighbors.contains(clone));
        assertTrue(n1.neighbors.contains(n0));
        assertTrue(n1.neighbors.contains(n2));
        assertTrue(n1.val == br.val);

        assertFalse(n2 == tl || n2 == tr || n2 == br || n2 == bl);
        assertTrue(n2.neighbors.size() == 2);
        assertTrue(n2.neighbors.contains(clone));
        assertTrue(n2.neighbors.contains(n1));
        assertTrue(n0istopright && n2.val == bl.val || !n0istopright && n2.val == tr.val);
    }
}