struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};
/*
 * @lc app=leetcode.cn id=24 lang=cpp
 *
 * [24] 两两交换链表中的节点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        ListNode* dummyHead = new ListNode(0, head);
        ListNode* cur = dummyHead;
        while(cur->next && cur->next->next) {
            ListNode* temp1 = cur->next;
            ListNode* temp2 = cur->next->next->next;
            cur->next = cur->next->next;
            cur->next->next = temp1;
            cur->next->next->next = temp2;
            cur = cur->next->next;
        }
        return dummyHead->next;
    }
};
// @lc code=end

