package com.wuhp.thread;

import com.wuhp.util.map.HashMap;

import java.util.*;

/**
 * 线程安全的类
 * StringBuffer Vector HashTable
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        Vector<String> strings = new Vector<>();
        ArrayList<String> strings1 = new ArrayList<>();

        Hashtable<String, Object> stringObjectHashtable = new Hashtable<>();
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();


        //线程同步的类
        List<String> objects = Collections.synchronizedList(new ArrayList<String>());

    }
}
