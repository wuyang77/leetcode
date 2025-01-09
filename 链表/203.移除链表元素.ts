/*
 * @lc app=leetcode.cn id=203 lang=typescript
 *
 * [203] 移除链表元素
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

class ListNodes {
    val: number
    next: ListNodes | null
    constructor(val?: number, next?: ListNodes | null) {
        this.val = (val===undefined ? 0 : val)
        this.next = (next===undefined ? null : next)
    }
}

function removeElements(head: ListNodes | null, val: number): ListNode | null {
    const dummy = new ListNodes(0, head);
    dummy.next = head;
    let cur = dummy;
    while(cur.next) {
        if(cur.next.val == val) {
            cur.next = cur.next.next;
        } else {
            cur = cur.next;
        }
    } 
    return dummy.next;
};
// @lc code=end

