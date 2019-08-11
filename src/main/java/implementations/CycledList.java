package implementations;

public class CycledList<T>
{
    class Node<T>
    {
        T data;
        Node next;
        Node prev;

        public Node(T value)
        {
            this.data = value;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;


}
