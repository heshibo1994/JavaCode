package Linked_list;

interface ILink<E> {
    public void add(E e);
}
class LinkImpl <E> implements ILink<E>{
    private class Node{//内部类
        private E data;
        private Node next;
        public Node (E data){
            this.data = data;
        }
    }
    //---------以上是link类中定义的成员
    private Node root;
    //---------以下是link类中定义的方法
    public void add(E e){
        if (e==null){
            return ;
        }
        Node  newNode = new Node(e);
        if (this.root ==null){//根节点不存在
            this.root = newNode;
        }
        else{
            this.root.next = newNode;

        }


    }
}
