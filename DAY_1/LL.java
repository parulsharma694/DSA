package DAY_1;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }

    public void reverseIterate() {
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // add - First
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    //add - Last
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList(){
        if (head == null){
            System.out.println("List is Empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //delete first
    public void deleteFirst(){
        if (head==null){
            System.out.println("This list is empty");
        }
        size--;
        head = head.next;
    }

    //deleteLast
    public void deleteLast(){
        if (head==null){
            System.out.println("This list is empty");
        }
        size--;
        if (head.next ==null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }

    public static void main(String args[]){
        LL list= new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
