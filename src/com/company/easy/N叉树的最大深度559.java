package com.company.easy;

import com.company.Node;

/**
 * 深度递归
 */
public class N叉树的最大深度559 {

    public int maxDepth(Node root) {
        return traverse(root, 0);
    }

    /**
     * 递归
     *
     * @param node  节点
     * @param depth 深度
     * @return 最大深度
     */
    private int traverse(Node node, int depth) {
        if (null == node) {
            return depth;
        }
        // 注意+1
        int temp = depth + 1;
        for (Node child : node.children)
            temp = Math.max(temp, traverse(child, depth + 1));
        return temp;
    }
}
