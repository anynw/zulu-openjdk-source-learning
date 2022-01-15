package com.wuhp.util.map;

import java.util.HashMap;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public interface Map<K, V> {

    V put(K k, V v);

    V get(K k);

    int size();

    interface Entry<K, V> {
        K getKey();

        V getValue();
    }
}
