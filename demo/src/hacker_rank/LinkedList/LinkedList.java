package hacker_rank.LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList(){
        this.head = new Node("head");
    }

    public void add(Node node){
        tail.next = node;
        tail = node;
    }

    public Node head(){
        return head;
    }

    public static class Node{
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
