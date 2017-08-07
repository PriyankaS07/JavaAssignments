class Node{
	protected int data;
	protected Node next;
	protected Node prev;


	public Node(){
		data=0;
		next=null;
		prev=null;
	}

	public Node(int d,Node n,Node p){
		data=d;
		next=n;
		prev=p;
	}

	public void setLinkPrev(Node p){
		prev=p;
	}

	public void setLinkNext(Node n){
		next=n;
	}

	public Node getLinkNext(){
		return next;
	}

	public Node getLinkPrev(){
		return prev;
	}

	public void setData(int d){
		data=d;
	}

	public int getData(){
		return data;
	}

}
class linkedList
{
    protected Node start;
    protected Node end ;
    public int size;
 
    /* Constructor */
    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }



     public void insertAtStart(int val)
    {
        Node nptr = new Node(val, null, null);        
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            start.setLinkPrev(nptr);
            nptr.setLinkNext(start);
            start = nptr;
        }
        size++;
        System.out.println("Node with value " +val+" inserted");
    }

	public void display()
	    {
	        System.out.print("\nDoubly Linked List = ");
	        if (size == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }
	        if (start.getLinkNext() == null) 
	        {
	            System.out.println(start.getData() );
	            return;
	        }
	        Node ptr = start;
	        System.out.print(start.getData()+ " <-> ");
	        ptr = start.getLinkNext();
	        while (ptr.getLinkNext() != null)
	        {
	            System.out.print(ptr.getData()+ " <-> ");
	            ptr = ptr.getLinkNext();
	        }
	        System.out.print(ptr.getData()+ "\n");
	    }


	public void deleteAtposition(int position)
    {        
        if (position == 1) 
        {
            if (size == 1)
            {
                start = null;
                end = null;
                size = 0;
                return; 
            }
            start = start.getLinkNext();
            start.setLinkPrev(null);
            size--; 
            return ;
        }
        if (position == size)
        {
            end = end.getLinkPrev();
            end.setLinkNext(null);
            size-- ;
        }
        Node ptr = start.getLinkNext();
        for (int i = 2; i <= size; i++)
        {
            if (i == position)
            {
                Node p = ptr.getLinkPrev();
                Node n = ptr.getLinkNext();
 
                p.setLinkNext(n);
                n.setLinkPrev(p);
                size-- ;
                return;
            }
            ptr = ptr.getLinkNext();
        }        
    }    

	public void insertAtposition(int val , int position)
	    {
	        Node nptr = new Node(val, null, null);    
	        if (position == 1)
	        {
	            insertAtStart(val);
	            return;
	        }            
	        Node ptr = start;
	        for (int i = 2; i <= size; i++)
	        {
	            if (i == position)
	            {
	                Node tmp = ptr.getLinkNext();
	                ptr.setLinkNext(nptr);
	                nptr.setLinkPrev(ptr);
	                nptr.setLinkNext(tmp);
	                tmp.setLinkPrev(nptr);
	            }
	            ptr = ptr.getLinkNext();            
	        }
	        size++ ;
	    }
}


public class DllTest{
	public static void main(String args[]){
		linkedList list = new linkedList();
		list.display();
		list.insertAtStart(10);
		list.display();
		list.insertAtStart(20);
		list.insertAtStart(30);
		list.display();
		list.deleteAtposition(2);
		list.display();
		list.insertAtposition(40,2);
		list.display();
	}
}