package dsa.linkedlist.singleLinkedList;

public class DesignLinkedList {
    public static void main(String[] args) {
        //["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get","get","deleteAtIndex","deleteAtIndex","get","deleteAtIndex","get"]
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        System.out.println("middle element "+ myLinkedList.findMiddleElement().val);
        System.out.println(myLinkedList.get(1));            // return 2
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        System.out.println(myLinkedList.get(1));
    }

    public static class MyLinkedList {
        private Node head ;
        private int size;
        public int get(int index) {
            if(index<0 || index >= this.size) return -1 ;
            Node curr = head;
            for(int i =0 ; i<index ; i++){
                curr = curr.next;
            }

            return  curr.val;
        }

        public Node findMiddleElement(){
            Node slow = this.head;
            Node fast = this.head;

            while (fast != null && fast.next !=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
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

        private static class Node{
            int val;
            Node next;
            public Node(int val){
                this.val = val;
            }
        }
    }


}
