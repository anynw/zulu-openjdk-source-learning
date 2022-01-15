package com.wuhp.util.map;

import java.util.Arrays;

/**
 * 自定义map 实现类
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class HashMap<K, V> implements Map<K, V> {

    Entry<K, V>[] table = null;
    int size = 0;

    public HashMap() {
        table = new Entry[16];
    }

    /**
     * 1、key 进行 hash
     * 2、值 进行取模 下标
     * 3、下标 数组对应下标对象
     * 4、判断对象是否为空，如果为空，直接存储
     * 5、如果不为空，冲突，链表存储
     * 6、返回value
     *
     * @param k
     * @param v
     * @return
     */
    @Override
    public V put(K k, V v) {
        int index = hash(k);
        Entry<K, V> entry = table[index];
        if (null == entry) { // 没有冲突,数组存储
            table[index] = new Entry<>(k, v, index, null);
            size++;
        } else { // 冲突，链表存储
            table[index] = new Entry<>(k, v, index, entry);
        }
        return null;
    }

    private int hash(K k) {
        int i = k.hashCode() % 16;
        return i >= 0 ? i : -i;
    }

    /**
     * 1、key 进行 hash 通过 index 查找数组
     * 2、判断是否为空
     * 3、如果为空，返回null
     * 4、如果不为空，比较是否相等，如果相等，返回。如果不相等，递归 链表
     * 5、返回
     *
     * @param k
     * @return
     */
    @Override
    public V get(K k) {
        if (size == 0) {
            return null;
        }
        int index = hash(k);
        // 查找链表
        Entry<K, V> entry = findValue(k, table[index]);
        return entry == null ? null : entry.getValue();
    }

    private Entry<K, V> findValue(K k, Entry<K, V> entry) {
        if (k.equals(entry.getKey()) || k == entry.getKey()) {
            return entry;
        } else {
            if (entry.next != null) {
                return findValue(k, entry.next);
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }


    class Entry<K, V> implements Map.Entry<K, V> {

        K k;
        V v;
        int hash;
        Entry<K, V> next;

        public Entry(K k, V v, int hash, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.hash = hash;
            this.next = next;
        }

        public K getK() {
            return k;
        }

        public void setK(K k) {
            this.k = k;
        }

        public V getV() {
            return v;
        }

        public void setV(V v) {
            this.v = v;
        }

        public int getHash() {
            return hash;
        }

        public void setHash(int hash) {
            this.hash = hash;
        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }
}
