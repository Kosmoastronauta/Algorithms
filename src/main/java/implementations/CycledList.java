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

    public boolean isEmpty()
    {
        return this.head == null;
    }

    public void addFront(T value)
    {
        Node newFront = new Node(value);

        newFront.prev = this.head.prev;
        newFront.next = this.head;
        this.head.prev = newFront;
        this.head = newFront;
    }

}
