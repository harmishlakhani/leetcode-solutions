package com.techmisal.easy;

import java.util.TreeMap; 
import java.util.Vector; 
import java.util.Map.Entry; 
	
	
	class Node 
    { 
        int key; 
        Node left; 
        Node right; 
          
        // Constructor 
        Node(int data) 
        { 
            key = data; 
            left = null; 
            right = null; 
        } 
    } 
	  
	public class VerticalOrderTraverse  
	{ 
	   
	    // Utility function to store vertical order in map 'm' 
	    // 'dist' is horizontal distance of current node from root.  
	    static void getVerticalOrder(Node root, int dist, 
	                                TreeMap<Integer,Vector<Integer>> m) 
	    { 
	        // Base case 
	        if(root == null) 
	            return; 
	          
	        //get the vector list at dist
	        Vector<Integer> get =  m.get(dist); 
	          
	        // Store current node in map 'm' 
	        if(get == null) 
	        { 
	            get = new Vector<>(); 
	            get.add(root.key); 
	        } 
	        else
	            get.add(root.key); 
	          
	        m.put(dist, get); 
	          
	        getVerticalOrder(root.left, dist-1, m); 
	          
	        getVerticalOrder(root.right, dist+1, m); 
	    } 
	      
	    // The main function to print vertical oder of a binary tree 
	    // with given root 
	    static void printVerticalOrder(Node root) 
	    { 
	        // Create a map and store vertical oder in map using 
	        // function getVerticalOrder() 
	        TreeMap<Integer,Vector<Integer>> m = new TreeMap<>(); 
	        int hd =0; 
	        getVerticalOrder(root,hd,m); 
	          
	        // Traverse the map and print nodes at every horizontal distance 
	        for (Entry<Integer, Vector<Integer>> entry : m.entrySet()) 
	        { 
	            System.out.println(entry.getValue()); 
	        } 
	    }

}
