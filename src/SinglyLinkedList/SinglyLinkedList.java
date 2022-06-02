package SinglyLinkedList;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void display() {
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void Beginning(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void End(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(14);
        ListNode fourth = new ListNode(16);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        //sll.display();

        //sll.Beginning(8);
        sll.End(18);
        sll.display();
    }
}
