package com.techmisal.medium;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class SuperUglyNumber {

    public int nthSuperUglyNumber(int n, int[] primes) {
        if (n <= 0 || primes == null || primes.length == 0) {
            return 0;
        }

        Queue<Long> queue = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();

        queue.add(1L);
        set.add(1L);

        for (int i = 1; i < n; i++) {
            Long head = queue.poll();
            for (int prime : primes) {
                Long next = head * prime;
                if (!set.contains(next)) {
                    queue.add(next);
                    set.add(next);
                }
            }
        }

        return queue.peek().intValue();
    }
}
