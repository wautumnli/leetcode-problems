package com.ql.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wautumnli
 * @date: 2021-01-09 16:49
 * 146. LRU 缓存机制
 **/
public class LeetCode146 {

    class LRUCache {
        class DLinkedNode {
            int key;
            int value;
            LRUCache.DLinkedNode prev;
            LRUCache.DLinkedNode next;
            public DLinkedNode() {}
            public DLinkedNode(int key, int value) { this.key = key; this.value = value; }
        }

        private Map<Integer, LRUCache.DLinkedNode> cache = new HashMap<>();
        private int size;
        private int capacity;
        private LRUCache.DLinkedNode head, tail;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.head = new LRUCache.DLinkedNode();
            this.tail = new LRUCache.DLinkedNode();
            this.head.next = this.tail;
            this.tail.prev = this.head;
        }

        public int get(int key) {
            LRUCache.DLinkedNode node = cache.get(key);
            if (node == null) {
                return -1;
            }
            moveToHaed(node);
            return node.value;
        }

        public void put(int key, int value) {
            LRUCache.DLinkedNode node = cache.get(key);
            if (node == null) {
                LRUCache.DLinkedNode addNode = new LRUCache.DLinkedNode(key, value);
                cache.put(key, addNode);
                addToHead(addNode);
                size++;
                if (size > capacity) {
                    LRUCache.DLinkedNode tailNode = removeTail();
                    cache.remove(tailNode.key);
                    --size;
                }
                return;
            }
            node.value = value;
            moveToHaed(node);
        }


        private void addToHead(LRUCache.DLinkedNode node) {
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
        }

        private void moveToHaed(LRUCache.DLinkedNode node) {
            removeNode(node);
            addToHead(node);
        }

        private void removeNode(LRUCache.DLinkedNode node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private LRUCache.DLinkedNode removeTail() {
            LRUCache.DLinkedNode node = tail.prev;
            removeNode(node);
            return node;
        }
    }
}


