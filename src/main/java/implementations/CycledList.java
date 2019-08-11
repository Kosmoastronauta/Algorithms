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

            newBack.next = this.head;
            newBack.prev = this.head.prev;
            this.head.prev = newBack;
        }
    }

    public T popFront()
    {
        if(!this.isEmpty())
        {
            boolean willBeEmpty = false;
            if(this.head==this.head.prev) willBeEmpty = true;

            T value = (T)this.head.next.data;
            this.head.prev.next = this.head.next;
            this.head.next.prev = this.head.prev;
            this.head = this.head.next;

            if(willBeEmpty) this.head = null;

            return value;
        }

        else  throw new NullPointerException("There is nothing to popFront");
    }

    public T popBack()
    {
        if(!this.isEmpty())
        {
            boolean willBeEmpty = false;
            if(this.head==this.head.prev) willBeEmpty = true;

            T value = (T) this.head.prev.data;
            this.head.prev.prev.next = this.head.prev;
            this.head.prev = this.head.prev.prev;

            if(willBeEmpty)
            this.head = null;
            return value;
        }
        else throw new NullPointerException("There is nothing to popBack");
    }

    public T getFront()
    {
        if(!this.isEmpty()) return (T) this.head.data;

        else throw new NullPointerException("There is nothing in front");
    }

    public T getBack()
    {
        if(!this.isEmpty()) return (T) this.head.prev.data;

        else throw new NullPointerException("There is nothing in back");
    }

}