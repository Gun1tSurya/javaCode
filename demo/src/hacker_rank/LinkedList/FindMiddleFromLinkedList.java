package hacker_rank.LinkedList;

public class FindMiddleFromLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add(new LinkedList.Node("1"));
        linkedList.add(new LinkedList.Node("2"));
        linkedList.add(new LinkedList.Node("3"));
        linkedList.add(new LinkedList.Node("4"));
        linkedList.add(new LinkedList.Node("5"));

        LinkedList.Node current = head;
        LinkedList.Node middle = head;
        int length = 0;

        while (current.getNext()!=null){
            length++;
            if(length%2==0){
                middle = middle.getNext();
            }
            current = current.getNext();
        }

        if(length%2==1){
            middle = middle.getNext();
        }

        System.out.println("Length of linkedlist : "+ length);
        System.out.println("Middle element from linkedList : "+ middle);

    }
}
