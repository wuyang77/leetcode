class ListNode2 {
    val: number;
    next: ListNode2 | null;
    constructor(val?: number, next?: ListNode2 | null) {
        this.val = (val === undefined ? 0 : val)
        this.next = (next===undefined ? null : next)
    }
}
/*
 * @lc app=leetcode.cn id=206 lang=typescript
 *
 * [206] 反转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function reverseList1(head: ListNode2 | null): ListNode2 | null {
    function reverse(cur: ListNode2 | null, prev: ListNode2 | null): ListNode2 | null {
        if (cur === null) {
            return prev;
        }
        let temp = cur.next;
        cur.next = prev;
        return reverse(temp, cur);
    }
    return reverse(head, null);
};

// @lc code=end

