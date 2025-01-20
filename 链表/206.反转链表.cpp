struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

/*
 * @lc app=leetcode.cn id=206 lang=cpp
 *
 * [206] 反转链表
 */

// @lc code=start

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        return reverse(head, nullptr);
    }
    
private:
    ListNode* reverse(ListNode* cur, ListNode* prev) {
        if (cur == nullptr) {
            return prev;
        }
        ListNode* temp = cur->next;
        cur->next = prev;
        return reverse(temp, cur);
    }
};
// @lc code=end

