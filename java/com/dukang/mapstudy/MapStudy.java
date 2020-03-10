package com.dukang.mapstudy;

import java.util.HashMap;

/**
 * @ClassName MapStudy
 * @Description TODO
 * @Auther dukang
 * @Date 2020-03-09 21:30
 * @Version 1.0
 */
public class MapStudy {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>(4);// 1
        /*int a1 = 1;
        int a2 = 2;
        int a3 = 5;
        System.out.println(String.valueOf(a1&3) + " " + String.valueOf(a2&3)+ " " + String.valueOf(a3&3));// 1 2 1 数组下标
        hashMap.put(a1, "1");// 2
        hashMap.put(a2, "2");// 3
        hashMap.put(a3, "5");// 4
        for (int i = 0; i < 20; i++) {
            if ((i&3) == 1) {
                System.out.println(i);
            }
        }*/
        hashMap.put(1,"1");
        hashMap.put(5,"5");
        hashMap.put(9,"9");
        System.out.println();
        int[] arr = {};

        //Set<Map.Entry<String, String>> entries = map.entrySet();
        /*for (Map.Entry entry : entries) {
            entry.getKey();
            entry.getValue();
        }*/
       /* Set<String> set = new HashSet<>();
        set.add("1111");*/

    }
}