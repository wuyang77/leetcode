
class ListNode2 {
    val: number;
    next: ListNode2 | null;
    constructor(val?: number, next?: ListNode2 | null) {
        this.val = (val === undefined ? 0 : val);
        this.next = (next === undefined ? null : next);
    }
}
/*
 * @lc app=leetcode.cn id=24 lang=typescript
 *
 * [24] 两两交换链表中的节点
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

function swapPairs1(head: ListNode2 | null): ListNode2 | null {
    let dummyHead = new ListNode2(0, head);
    let cur = dummyHead;
    while(cur.next != null && cur.next.next != null) {
        let temp1 = cur.next;
        let temp2 = cur.next.next.next;
        cur.next = cur.next.next;
        cur.next.next = temp1;
        cur.next.next.next = temp2;
        cur = cur.next.next;
    }
    return dummyHead.next;
};
// @lc code=end

