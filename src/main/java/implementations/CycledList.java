package implementations;

public class CycledList<T>
{
    class Node<T>
    {
        T data;
        Node next;
        Node prev;

        public Node() {}

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

        if(this.isEmpty())
        {
            this.head = new Node(value);
            this.head.next = this.head;
            this.head.prev = this.head;
        }

        else
        {
            newFront.prev = this.head.prev;
            newFront.next = this.head;
            this.head.prev = newFront;
            this.head = newFront;
        }
    }

    public void addBack(T value)
    {
        if(this.isEmpty())
        {
            this.head = new Node(value);
            this.head.next = this.head;
            this.head.prev = this.head;
        }
        else
        {
            Node newBack = new Node(value);

            newBack.prev = this.head.prev;
            newBack.next = this.head;
            this.head.prev = newBack;
        }
    }

    public T popFront()
    {
        if(this.head != null)
        {
            T value = (T)this.head.next.data;
            this.head.prev.next = this.head.next;
            this.head.next.prev = this.head.prev;
            this.head = this.head.next;

            return value;
        }

        else  throw new NullPointerException("There is nothing to popFront");
    }

    public T popBack()
    {
        if(this.head != null)
        {
            T value = (T) this.head.prev.data;
            this.head.prev.prev.next = this.head.prev;
            this.head.prev = this.head.prev.prev;

            return value;
        }
        else throw new NullPointerException("There is nothing to popBack");
    }

    public T getFront()
    {
        if(this.head != null) return (T) this.head.data;

        else throw new NullPointerException("There is nothing in front");
    }

    public T getBack()
    {
        if(this.head.prev != null) return (T) this.head.prev.data;

        else throw new NullPointerException("There is nothing in back");
    }

}