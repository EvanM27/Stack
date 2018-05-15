public class Stack 
{
    public class Node 
    {
        private int info;   
        private Node next;  

        public Node() 
        {
            info = 0;
            next = null;
        }

        public void setInfo(int i) 
        {
            info = i;
        }

        public void setNext(Node l) 
        {
            next = l;
        }

        public int getInfo() 
        {
            return info;
        }

        public Node getNext() 
        {
            return next;
        }
    }

    private Node first;

    public Stack() 
    {
        first = new Node();
    }
    
    public boolean isEmpty() 
    {
        return (first.getNext() == null);
    }
    
    public void push(int x)
    {
        Node temp = new Node();
        temp.setInfo(x);
        temp.setNext(first.next);
        first.setNext(temp);
    }
    
    public void pop()
    {
        if(this.isEmpty())
        {
            System.out.println("Error, Stack is empty!");
            return;
        }
        System.out.println(first.next.getInfo());
        first.setNext(first.next.getNext());
    }
    
    public void peek()
    {
        if(this.isEmpty())
        {
            System.out.println("Error, Stack is empty!");
            return;
        }
        System.out.println(first.next.getInfo());
    }
}
