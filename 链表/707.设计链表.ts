/*
 * @lc app=leetcode.cn id=707 lang=typescript
 *
 * [707] 设计链表
 */

// @lc code=start

class ListNode1 {
    public val: number
    public next: ListNode1 | null
    constructor(val?: number, next?: ListNode1 | null) {
        this.val = val === undefined ? 0 : val;
        this.next = next === undefined ? null : next;
    }
}

class MyLinkedList2 {
    private size: number;
    private head: ListNode | null;
    private tail: ListNode | null;
    constructor() {
        // 记录链表长度
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    get(index: number): number {
        if(index < 0 || index >= this.size) return -1;
        let cur = this.getNode(index);
        return cur.val;
    }
    // 获取指定Node节点
    private getNode(index: number): ListNode {
        let curNode: ListNode = new ListNode(0, this.head);
        for(let i = 0; i < index + 1; i++) {
            curNode = curNode.next!;
        }
        return curNode;
    }

    addAtHead(val: number): void {
        // 创建新节点
        let node: ListNode = new ListNode(val, this.head);
        // 更新头节点
        this.head = node;
        // 如果链表为空，则新节点也是尾节点
        if(!this.tail) {
            this.tail = node;
        }
        this.size++;
    }

    addAtTail(val: number): void {
        let node: ListNode = new ListNode(val, null)
        if(this.tail){
            this.tail.next = node;
        } else {
            this.head = node;
        }
        this.tail = node;
        this.size++;
    }

    addAtIndex(index: number, val: number): void {
        if(index === this.size ) {
            this.addAtTail(val);    
            return;
        }
        if(index > this.size) {
            return;
        }
        if(index <= 0) {
            this.addAtHead(val);
            return;
        }
        let curNode: ListNode = this.getNode(index - 1);
        let node: ListNode = new ListNode(val, curNode.next);
        curNode.next = node;
        this.size++
    }

    deleteAtIndex(index: number): void {
        // 如果索引无效，则不进行任何操作
        if(index < 0 || index >= this.size) return;
        // 如果删除的是头节点
        if(index === 0) {
            this.head = this.head!.next;
            // 如果链表只有一个节点，则尾节点也置为null
            if(index === this.size -1) {
                this.tail = null;
            }
            this.size--;
            return;
        }
        // 获取目标节点的前一个节点
        let curNode: ListNode = this.getNode(index - 1);
        // 更新目标节点的前一个节点的next指针
        curNode.next = curNode.next!.next;
        // 如果删除的是尾节点，则更新尾节点
        if(index == this.size - 1) {
            // 更新尾节点
            this.tail = curNode;
        }
        this.size--
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = new MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(val)
 * obj.addAtTail(val)
 * obj.addAtIndex(index,val)
 * obj.deleteAtIndex(index)
 */
// @lc code=end

