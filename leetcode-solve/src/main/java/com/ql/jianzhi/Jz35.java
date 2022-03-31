package com.ql.jianzhi;

import com.ql.pojo.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanqiuli
 * @date 2022/3/31 10:06
 */
public class Jz35 {
    Map<Node, Node> cachedNode = new HashMap<Node, Node>();

    /**
     * todo 还存在最优解
     *
     * @param head the head
     * @return the {@link Node} data
     */
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        if (!cachedNode.containsKey(head)) {
            Node headNew = new Node(head.val);
            cachedNode.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cachedNode.get(head);
    }
}
