/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
        // ListNode curr = head;
        // if( curr != null && curr.next != null) {
        //     curr.next = curr.next.next;
        // } else {
        //     curr = curr.next;
        // }
        // return head;

        // 2.虚拟头结点法
        // 设置一个虚拟的头结点
        ListNode dummy = new ListNode(); 
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
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

