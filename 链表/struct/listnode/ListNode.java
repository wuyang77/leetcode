package struct.listnode;


/**
 * 链表节点类
 * @author 吴洋
 */
public class ListNode {
    /** 结点的值 */
    public int val;

    /** 下一个结点 */
    public ListNode next;

    /** 默认构造函数 */
    public ListNode(){};

    /**
     * 节点的构造函数
     * @param val 节点的值
     */
    public ListNode(int val) {
        this.val = val;
    }

    /**
     * 节点的构造函数
     * @param val 节点的值
     * @param next 下一个节点
     */
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    
}                                       
