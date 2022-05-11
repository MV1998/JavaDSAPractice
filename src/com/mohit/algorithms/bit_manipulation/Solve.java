package com.mohit.algorithms.bit_manipulation;

import com.google.gson.Gson;

import java.util.*;
import java.util.stream.Collector;

class Solve
{
    public void solve() {
        topKFrequent(new int[]{1,3,2,4,2,4,4,4}, 2);
    }

    class Pair {
        int x;
        int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {

        Arrays.sort(nums); // nlogn

        HashMap<Integer, Integer> map = new HashMap();

        for (int x : nums) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x)+1);
            }else {
                map.put(x, 1);
            }
        }
        int[] n  = new int[k];
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> integerIntegerEntry, Map.Entry<Integer, Integer> t1) {
                return (integerIntegerEntry.getKey().compareTo(t1.getValue()));
            }
        });

        int index = 0;
        for (int i = list.size() - 1; i >=0; i--) {
            if (index < k) {
                n[index] = list.get(i).getKey();
                index++;
            }else{
                break;
            }
        }

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(--test > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x == y || x > y) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        return n;
    }
}
