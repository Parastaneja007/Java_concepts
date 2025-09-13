package Collection_framework;

public class Test {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        node1.value = 1;
        node1.next = node2;
        node2.value = 2 ;
        node2.next = null;
        // it is just showm for how linked list have internal system and how it works
        // no need to make this , we have in built , just made for clear understanding
    }
}
class Node{
    public int value ;
    public Node next ;
}
