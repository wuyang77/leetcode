class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val =val;
        this.next = null;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// @lc code=start
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

class Solution { 
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
    public ListNode reverse(ListNode cur, ListNode prev) {
        if (cur == null) {
            return prev;
        }
        ListNode temp = cur.next;
        cur.next = prev;
        return reverse(temp, cur);
    }

    // public static void main(String[] args) {
    //     ListNode head = new ListNode(1);
    //     head.next = new ListNode(2);
    //     head.next.next = new ListNode(3);
    //     head.next.next.next = new ListNode(4);
    //     head.next.next.next.next = new ListNode(5);
    //     Solution206 solution206 = new Solution206();
    //     ListNode result = solution206.reverseList(head);
    //     // 打印结果
    //     while(result != null) {
    //         System.out.print(result.val);
    //         System.out.print("--->");
    //         result = result.next;
    //     }
    //     System.out.println("null");
    // }
}
// @lc code=end

