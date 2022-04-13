package com.education.TDDSB.CodeWars;

import java.util.HashMap;
import java.util.Map;

public class LoopInspector {

    public int loopSize(Node node) {
        Map<Integer, Integer> map = new HashMap<>();
        int repeated = 0;
        Integer key;
        Node currentNode = node;
        do {
            key = currentNode.hashCode();

            if (map.get(key) == null) {
                map.put(key, 1);
            } else {
                repeated++;
                map.compute(key, (integer, integer2) -> integer2 + 1);
            }

            if (map.get(key) == 3)
                return repeated - 1;

            currentNode = currentNode.getNext();

        } while (node.getNext() != null);
        return -1;
    }

}