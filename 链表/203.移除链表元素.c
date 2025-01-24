/*
 * @lc app=leetcode.cn id=203 lang=c
 *
 * [203] 移除链表元素
 */

#include <stdlib.h>  // Include this header for NULL and malloc

// @lc code=start
/**
 * Definition for singly-linked list.
 */
struct ListNode {
    int val;
    struct ListNode *next;
};

// Function to remove elements
struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode *dummy;
    dummy = (struct ListNode *) malloc(sizeof(struct ListNode));
    dummy->next = head;
    struct ListNode *cur = dummy;
    while(cur->next != NULL) {
        if(cur->next->val == val) {
            struct ListNode *tmp = cur->next;
            cur->next = cur->next->next;
            free(tmp);
        } else {
            cur = cur->next;
        }
    }
    head = dummy->next;
    free(dummy);
    return head;
}
// @lc code=end 