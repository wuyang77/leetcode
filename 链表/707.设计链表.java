/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start


/**
 * 设计链表单链表的解法
 */
class MyLinkedList{

    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    /** 记录的是链表的大小 */
    private int size;
    
    /** 记录的是虚拟头结点 */
    private ListNode head;
    
    /**
     * 初始化链表
     */
    public MyLinkedList() {
        this.size = 0;
        this.head = new ListNode(0);
    }
    
    public int get(int index) {
        // 如果索引无效，返回 -1
        if(index < 0 || index >= size) {
            return -1;
        }
        // 遍历链表，找到第 index 个节点
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        // 返回第 index 个节点的值
        return cur.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        // 将新节点插入到头结点之后
        newNode.next = head.next;
        head.next = newNode;
        // 链表大小加 1
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        // 遍历链表，找到最后一个节点
        ListNode cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        // 将新节点插入到最后一个节点之后
        cur.next = newNode;
        // 链表大小加 1
        size++;
     }
    
    public void addAtIndex(int index, int val) {
        // 如果索引无效，直接返回
        if(index < 0 || index >= size) {
            return;
        }
        // 遍历链表，找到第 index 个节点
        ListNode cur = head;
        ListNode newNode = new ListNode(val);
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        // 将新节点插入到第 index 个节点之后
        newNode.next = cur.next;
        cur.next = newNode;
        // 链表大小加 1
        size++;
    }
    
    public void deleteAtIndex(int index) {
        // 如果索引无效，直接返回
        if(index < 0 || index >= size) {
            return;
        }
        // 遍历链表，找到第 index 个节点
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        // 删除第 index 个节点
        cur.next = cur.next.next;
        // 链表大小减 1
        size--;
    }
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1,2);
        obj.get(1);
        obj.deleteAtIndex(1);
        obj.get(1);       
    }
}
/**
 * 设计链表双链表的解法
 
 */
class MyLinkedList2 {
    
    class ListNode {
        int val;
        ListNode next, prev;
        public ListNode(int val) {
            this.val = val;
        }
    }
    /** 记录的是链表的大小 */
    private int size;
    /** 记录的是虚拟头结点和虚拟尾结点 */
    private ListNode head, tail;

    /** 用于判断从头或尾遍历的阈值 */
    private static final int HALF = 2;

    /**
     * 初始化链表
     * 初始化虚拟头结点和虚拟尾结点
     * 将虚拟头结点和虚拟尾结点连接起来
     * 初始化链表大小
     */
    public MyLinkedList2() {
        this.size = 0;
        this.head = new ListNode(0);
        this.tail = new ListNode(0);
        this.head.next = tail;
        this.tail.prev = head;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) {
            return -1;
        }
        // 用于遍历链表的节点
        ListNode cur;
        // 判断从头遍历还是从尾遍历，哪边遍历的时间更短
        if(index < size / HALF) {
            cur = head;
            for (int i = 0; i < index; i++) {
                // 从头开始遍历
               cur = cur.next; 
            }
        } else {
            cur = tail;
            for (int i = 0; i < size - index; i++) {
                // 从尾开始遍历
                cur = cur.prev;
            }
        }
        // 返回第 index 个节点的值
        return cur.val;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

