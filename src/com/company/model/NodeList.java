package com.company.model;

public class NodeList {
    /**
     * 节点
     */
    class ListNode {
        int val;
        ListNode next;
    }

    /**
     * 循环遍历
     *
     * @param head 节点
     */
    void loop(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) {
            // 迭代访问 p.val
        }
    }

    /**
     * 递归遍历
     *
     * @param head 节点
     */
    void recursive(ListNode head) {
        // 递归访问 head.val
        recursive(head.next);
    }
}
