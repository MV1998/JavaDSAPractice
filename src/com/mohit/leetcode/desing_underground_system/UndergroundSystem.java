package com.mohit.leetcode.desing_underground_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndergroundSystem {

    String s = "";
    Map<Integer, Map<String, Integer>> startTravelInfo;
    Map<Map<String, String>, List<Integer>> averageCustomer;

    public UndergroundSystem() {
        startTravelInfo = new HashMap<>();
        averageCustomer = new HashMap<>();
        
    }

    public void checkIn(int id, String stationName, int t) {
        Map<String, Integer> stationAndTimeMap = new HashMap<>();
        stationAndTimeMap.put(stationName, t);
        startTravelInfo.put(id, stationAndTimeMap);
    }

    public void checkOut(int id, String stationName, int t) {
        Map<String, Integer> map = startTravelInfo.get(id);
        Map<String, String> s = new HashMap<>();
        int startTime = 0;
        for (Map.Entry<String, Integer> ll :map.entrySet()) {
            s.put(ll.getKey(), stationName);
            startTime = ll.getValue();
        }

        List<Integer> list = averageCustomer.get(s);
        if (list.size() > 0) {
            list.add(t - startTime);
        }
        averageCustomer.put(s, list);
    }

    public double getAverageTime(String startStation, String endStation) {
        Map<String, String> s = new HashMap<>();
        s.put(startStation, endStation);
        List<Integer> ss = averageCustomer.get(s);
        double average = 0.0;
        for (Integer number : ss) {
            average += number;
        }
        return average/ss.size();
    }
}