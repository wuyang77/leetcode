#
# @lc app=leetcode.cn id=707 lang=python3
#
# [707] 设计链表
#

# @lc code=start

# 单链表的解法
# class ListNode:
#     def __init__(self, val = 0, next = None):
#         self.val = val
#         self.next = next

# class MyLinkedList:

#     def __init__(self):
#         self.size = 0
#         self.dummy_Head = ListNode()

#     def get(self, index: int) -> int:
#         if index < 0 or index >= self.size:
#             return -1
        
#         cur = self.dummy_Head
#         for i in range(index + 1):
#             cur = cur.next
#         return cur.val

#     def addAtHead(self, val: int) -> None:
#         self.dummy_Head.next = ListNode(val, self.dummy_Head.next)
#         self.size += 1

#     def addAtTail(self, val: int) -> None:
#         cur = self.dummy_Head
#         while cur.next:
#             cur = cur.next
#         cur.next = ListNode(val, None)
#         self.size +=1

#     def addAtIndex(self, index: int, val: int) -> None:
#         if index < 0 or index > self.size:
#             return
#         cur = self.dummy_Head
#         for i in range(index):
#             cur = cur.next 
#         cur.next = ListNode(val, cur.next)
#         self.size += 1

#     def deleteAtIndex(self, index: int) -> None:
#         if index < 0 or index >= self.size:
#             return
#         cur = self.dummy_Head
#         for i in range(index):
#             cur = cur.next
#         cur.next = cur.next.next
#         self.size -=1

# 双链表的解法
class ListNode:
    def __init__(self, val=0, next=None, prev=None):
        self.val = val
        self.next = next
        self.prev = prev

class MyLinkedList:
    def __init__(self):
        self.size = 0
        self.head = ListNode()
        self.tail = ListNode()
        self.head.next = self.tail
        self.tail.prev = self.head

    def get(self, index: int) -> int:
        if index < 0 or index >= self.size:
            return -1
        if index <= self.size >> 2:
            cur = self.head
            for i in range(index + 1):
                cur = cur.next
        else:
            cur = self.tail
            for i in range(self.size - index):
                cur = cur.prev
        return cur.val
    
    def addAtHead(self, val: int) -> None:
        self.addAtIndex(0, val)

    def addAtTail(self, val: int) -> None:
        self.addAtIndex(self.size, val)

    def addAtIndex(self, index: int, val: int) -> None:
        if index < 0 or index > self.size:
            return
        cur = self.head
        for i in range(index):
            cur = cur.next
        new_node = ListNode(val, cur.next, cur)
        cur.next.prev = new_node
        cur.next = new_node
        self.size += 1

    def deleteAtIndex(self, index: int) -> None:
        if index < 0 or index >= self.size:
            return
        cur = self.head
        for i in range(index):
            cur = cur.next
        cur.next = cur.next.next
        cur.next.prev = cur
        self.size -= 1

    # def print_list(self, index: int) -> int:
    #     cur = self.head
    #     for i in range(index + 1):
    #         cur = cur.next
    #     return print(cur.val, end='  ')
    
    # def print_list_transform(self) -> str:
    #     for i in range(obj.size):
    #         str = obj.print_list(i)
    #     print('over', end='\n')
    #     print('------------------------------')
# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# obj.addAtHead(1)
# obj.print_list_transform()
# obj.addAtTail(3)
# obj.print_list_transform()
# obj.addAtIndex(1, 2)
# obj.print_list_transform()
# print(obj.get(1), end=' get(1)\n------------------------------\n')
# obj.addAtIndex(1, 6)
# obj.addAtIndex(1, 7)
# obj.addAtIndex(1, 8)
# obj.addAtIndex(1, 2)
# obj.deleteAtIndex(1)
# obj.print_list_transform()
# print(obj.get(1), end=' get(1)\n')

# @lc code=end

