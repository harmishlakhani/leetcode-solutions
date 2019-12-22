package com.techmisal.medium;

import java.util.*;

public class MinimumHeightTree {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        if(n==0){
            return result;
        }
        if(n==1){
            result.add(0);
            return result;
        }

        ArrayList<HashSet<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new HashSet<>());
        }

        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        LinkedList<Integer> leaves = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(graph.get(i).size()==1){
                leaves.offer(i);
            }
        }

        if(leaves.size()==0){
            return result;
        }

        while(n>2){
            n = n-leaves.size();

            LinkedList<Integer> newLeaves = new LinkedList<>();

            for(int l: leaves){
                int neighbor = graph.get(l).iterator().next();
                graph.get(neighbor).remove(l);
                if(graph.get(neighbor).size()==1){
                    newLeaves.add(neighbor);
                }
            }

            leaves = newLeaves;
        }

        return leaves;
    }
}
