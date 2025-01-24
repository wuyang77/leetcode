/**
 * @author 吴洋
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}
/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
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

class Solution24 {
    // public ListNode swapPairs(ListNode head) {
    //     ListNode dummyHead = new ListNode(0, head);
    //     ListNode cur = dummyHead;
    //     while(cur.next != null && cur.next.next != null) {
    //         ListNode temp1 = cur.next;
    //         ListNode temp2 = cur.next.next.next;
    //         cur.next = cur.next.next;
    //         cur.next.next = temp1;
    //         cur.next.next.next = temp2;
    //         cur = cur.next.next;
    //     }
    //     return dummyHead.next;
    // }

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        Solution24 solution = new Solution24();
        ListNode result = solution.swapPairs(head);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
// @lc code=end

