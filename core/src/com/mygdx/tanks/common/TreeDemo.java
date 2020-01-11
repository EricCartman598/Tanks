package com.mygdx.tanks.common;

import java.util.*;

public class TreeDemo {
    public static void main(String[] args) {
        Map<String, Integer> tree = new TreeMap<>();
        tree.put("X-Ray", 1);
        tree.put("Sierra", 1);
        tree.put("Bravo", 1);
        tree.put("Alfa", 2);
        tree.put("Zulu", 3);
        tree.put("Charlie", 4);
        tree.put("Delta", 5);

        Set<Map.Entry<String, Integer>> entries = tree.entrySet();
        for (Map.Entry<String, Integer> next : entries) {
            System.out.println("key = " + next.getKey());
            System.out.println("value = " + next.getValue());
        }
    }

}
