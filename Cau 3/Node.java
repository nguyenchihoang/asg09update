public class Node  {
    Item data;
    Node next;

    public Node(Item data)
    {
        this.data = data.clone();
    }
    public Node(Item data,Node next)
    {
       this.data= data.clone();
       this.next= next;
    }
}

