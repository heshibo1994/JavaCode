package Linked_list;

public class JavaDemo {
    public static void main(String[] args) {
        Node<String> n1 = new Node("火车头");
        Node<String> n2 = new Node("火车1");
        Node<String> n3 = new Node("火车2");
        Node<String> n4 = new Node("火车3");
        Node<String> n5 = new Node("火车4");
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        print(n1);
    }

    public static void print(Node<?>node){
        if (node!=null){
            System.out.println(node.getData());
            print(node.getNext());
        }
    }


}
