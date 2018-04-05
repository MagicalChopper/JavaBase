package com.coder.data_structure.linked_list;

/**
 * 自定义设计链表
 */
public class LinkedListDemo {

    public int count;
    public Node root;

    public LinkedListDemo() {
        root = new Node("root",0);
        root.next = null;
    }

    /**
     * 链表插入，在最后
     * @param node
     */
    public void insert(Node node){
        Node point = root;
        while(point.next!=null){
            point = point.next;
        }
        point.next = node;
    }

    /**
     * 删除节点
     * 从头指针开始往后走，（本例仅以name相同判断，暂不判断value）遇到相同值的node，
     * 看该node是否是链表的最后一个结点，若该节点不为最后一个结点，（该节点对应代码里为point.next）
     * 将该结点的下一个结点与该节点上一个结点连接（即删除了该节点），
     * 若为最后一个结点，则该结点的下一个为null，直接将该结点置空
     * @param node
     */
    public void delete(Node node){
        Node point = root;
        while(point.next!=null){
            if(point.next.name.equals(node.name)) {
                if(!point.next.next.equals(null)){
                    point.next = point.next.next;
                }else{
                    point.next=null;
                }
            }else{
                point =point.next;
            }
        }
    }

    /**
     * 查询结点
     * 从根节点找找到name相同的结点则返回
     * @param node
     * @return
     */
    public Node find(Node node){
        Node point = root;
        while(point.next!=null){
            if(point.next.name.equals(node.name)){
                return point.next;
            }else {
                point = point.next;
            }
        }
        return null;
    }

    /**
     * 思考下结点的左插入，右插入
     */

}
