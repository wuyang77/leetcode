/*
 * @lc app=leetcode.cn id=707 lang=javascript
 *
 * [707] 设计链表
 */

// @lc code=start
class LinkNode {
    constructor(val, next) {
        this.val = val;
        this.next = next;
    }
}

var MyLinkedList = function() {
    this._size = 0;
    this._head = null;
    this._tail = null;
};

MyLinkedList.prototype.getNode = function(index) {
    if(index < 0 || index >= this._size) return null;
    // 创建虚拟头结点
    let cur = new ListNode(0, this._head);
    for(let i = 0; i < index + 1; i++) {
        cur = cur.next;
    }
    return cur.val;
}
/** 
 * @param {number} index
 * @return {number}
 */
MyLinkedList.prototype.get = function(index) {
    if(index < 0 || index >= this._size) return -1;
    return this.getNode(index);
};

/** 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtHead = function(val) {
    // 创建新节点
    const newNode = new ListNode(val, this._head);
    // 更新链表长度
    this._head = newNode;
    this._size++;
    // 如果链表为空，则新节点也是尾节点
    if(!this._tail) {
        this._tail = newNode;
    }
};

/** 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtTail = function(val) {
    // 创建新节点
    const newNode = new LinkNode(val, null);
    // 更新链表长度
    this._size++;
    // 如果链表不为空，则将新节点添加到链表尾部
    if(this._tail) {
        this._tail.next = newNode;
        this._tail = newNode;
        return;
    }
    // 如果链表为空，则将新节点添加到链表头部
    this._tail = newNode;  
    // 更新头节点
    this._head = newNode;
};

/** 
 * @param {number} index 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtIndex = function(index, val) {
    // 如果索引大于链表长度，则不添加
    if(index > this._size) return;
    // 如果索引为0，则添加到链表头部
    if(index <= 0) {
        this.addAtHead(val);
        return;
    }
    // 如果索引等于链表长度，则添加到链表尾部
    if(index === this._size) {
        this.addAtTail(val);
        return;
    }
    // 获取目标节点的上一个的节点
    const node = this.getNode(index - 1);
    node.next = new LinkNode(val, node.next);
    this._size++;
};

/** 
 * @param {number} index
 * @return {void}
 */
MyLinkedList.prototype.deleteAtIndex = function(index) {
    if(index < 0 || index >= this._size) return;
    if(index === 0) {
        // 更新头节点
        this._head = this._head.next;
        // 如果删除的这个节点同时是尾节点，要处理尾节点
        if(index === this._size - 1){
            this._tail = this._head
        }
        this._size--;
        return;
    }
    // 获取目标节点的上一个的节点
    const node = this.getNode(index - 1);    
    node.next = node.next.next;
    // 处理尾节点
    if(index === this._size - 1) {
        this._tail = node;
    }
    this._size--;
};

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

