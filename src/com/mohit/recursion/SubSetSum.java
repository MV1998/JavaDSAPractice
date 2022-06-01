package com.mohit.recursion;

import java.util.List;

public class SubSetSum {
    public void subSetSum(List<Integer> result, List<Integer> actualList, int index, int targetSum) {

        if (index == actualList.size()) {
            if (!result.isEmpty()) {
                System.out.println(result);
            }
//            int sum = 0;
//            for (int element : result) {
//                sum += element;
//            }
//            if (sum == targetSum) {
//                System.out.println(result);
//            }
            return;
        }

        result.add(actualList.get(index));
        subSetSum(result, actualList, index+1, targetSum);


        result.remove(result.size()-1);
        subSetSum(result, actualList, index+1, targetSum);

    }
}
