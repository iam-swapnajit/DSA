package dsa.linkedlist.singleLinkedList;

public class DesignLinkedList {
    public static void main(String[] args) {
        //["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get","get","deleteAtIndex","deleteAtIndex","get","deleteAtIndex","get"]
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
       // System.out.println("middle element "+ myLinkedList.findMiddleElement().val);
        //System.out.println(myLinkedList.get(1));            // return 2
        //myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        //System.out.println(myLinkedList.get(1));
        myLinkedList.print();
        myLinkedList.reverseLinkedList();
        myLinkedList.print();
    }




}
