# 定义链表节点类
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeElements(self, head: ListNode, val: int) -> ListNode:
        dummy_head = ListNode(next=head)
        current = dummy_head
        while current.next:
            if current.next.val == val:
                current.next = current.next.next
            else:
                current = current.next
        return dummy_head.next

    @staticmethod
    def main():
        node1 = ListNode(6)
        node2 = ListNode(5)
        node3 = ListNode(4)
        node4 = ListNode(6)
        node5 = ListNode(1)
        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5
        node5.next = None

        solution = Solution()
        result = solution.removeElements(node1, 6)

        while result:
            print(result.val, end="->" if result.next else "")
            result = result.next

if __name__ == "__main__":
    Solution.main()