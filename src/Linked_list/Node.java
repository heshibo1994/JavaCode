package Linked_list;

public class Node<E> {
    private E data;
    private Node next;
    public Node(E data){
        this.data = data;
    }

    public E getData(){
        return this.data;
    }
    public  void setData(E data){
        this.data = data;
    }

    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){
        this.next = next;
    }
}
