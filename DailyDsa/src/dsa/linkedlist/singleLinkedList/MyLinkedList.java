package dsa.linkedlist.singleLinkedList;

public class MyLinkedList {
    Node head ;
    int size;
    public int get(int index) {
        if(index<0 || index >= this.size) return -1 ;
        Node curr = head;
        for(int i =0 ; i<index ; i++){
            curr = curr.next;
        }

        return  curr.val;
    }

    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val);
            System.out.print(" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
        size++;

    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            addAtHead(val);
            return;
        }

        Node curr = this.head ;
        while (curr.next != null){
            curr = curr.next;
        }


        curr.next = newNode;
        size ++;
    }

    public void addAtIndex(int index, int val) {
        if(index >size) return;
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        Node curr = this.head;
        for(int i =0 ; i< index-1; i++){
            curr = curr.next;
        }
        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;
        this.size ++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index >= this.size) return;
        if(index == 0){
            head = head.next;
        }else {
            Node curr = head;
            for(int i = 0 ; i < index-1 ; i++){
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        this.size --;
    }


    /**
     * FInd middle element problem
     * <a href="https://leetcode.com/problems/middle-of-the-linked-list/">...</a>
     */
    public Node findMiddleElement(){
        Node slow = this.head;
        Node fast = this.head;

        while (fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void reverseLinkedList(){
        Node prev = null;
        Node curr = head;
        Node after =  null;
        while(curr != null){

            after = curr.next;
            curr.next =prev;
            prev =curr;
            curr = after;

        }
        this.head = prev;
    }




    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
}
