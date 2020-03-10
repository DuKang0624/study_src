package com.dukang.liststudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListDemo01
 * @Description TODO
 * @Auther dukang
 * @Date 2020/03/05 20:54
 * @Version 1.0
 */
public class ListDemo01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            int next = (int) iterator.next();
            if (next == 1) {
                list.remove(next);
                iterator.remove();
            }
        }


        /*System.out.println(10 >> 1);
        System.out.println(10 >> 2);

        System.out.println("-------------------");

        System.out.println(10 << 1);
        System.out.println(10 << 2);*/
    }
}