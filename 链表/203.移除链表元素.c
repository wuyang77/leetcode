struct ListNode {
    int val;
    struct ListNode *next;
    
}

/*
 * @lc app=leetcode.cn id=203 lang=c
 *
 * [203] 移除链表元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeElements(struct ListNode* head, int val) {
    typedef struct  ListNode ListNode;
    ListNode *dummy;
    dummy = (ListNode *) malloc(sizeof(ListNode));
    dummy->next = head;
    ListNode *cur = dummy;
    while(cur->next != NULL) {
        if(cur->next->val == val) {
            ListNode *tmp = cur->next;
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

