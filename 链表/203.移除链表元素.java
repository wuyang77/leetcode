/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 * 
 * 给你一个链表的头节点 head 和一个整数 val ，
 * 请你删除链表中所有满足 Node.val == val 的节点，
 * 并返回新的头节点 。
 */

// @lc code=start


import 定义链表节点.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        // 1.用原来的链表操作：
        // while(head != null && head.val == val) {
        //     head = head.next;
        // }
        // ListNode cur = head;
        // while(cur != null && cur.next != null) {
        //     if (cur.next.val == val) {
        //         cur.next = cur.next.next;
        //     } else {
        //         cur = cur.next;
        //     }
        // }
        // return head;

        // 2.虚拟头结点法
        // 设置一个虚拟的头结点
        // ListNode dummy = new ListNode(); 
        // dummy.next = head;
        // ListNode cur = dummy;
        // while(cur.next != null) {
        //     if(cur.next.val == val) {
        //         cur.next = cur.next.next;
        //     } else {
        //         cur = cur.next;
        //     }
        // }
        // return dummy.next;
        // 3.递归法
        if (head == null) {
            return head;
        }  
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    
    public static void main(String[] args) {
        ListNode node1 = new ListNode(6);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = null;
        
        Solution203 solution203 = new Solution203();
        System.out.println(solution203.removeElements(node1, 6).toString());     
    }
}
// @lc code=end

