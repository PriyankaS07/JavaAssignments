class QueuedArray{
	int Queue[];
	int front;
	int rear;
	int size;
	int len;


	public QueuedArray(int n){
		size=n;
		len=0;
		Queue=new int[size];
		front=-1;
		rear=-1;
	}


	public boolean isEmpty(){
		return front==-1;
	}

	public boolean isFull(){
		return front==0 && rear==size-1;
	}

	public int getSize(){
		return len;
	}

	public void insert(int i) 
    {
        if (rear == -1) 
        {
            front = 0;
            rear = 0;
            Queue[rear] = i;
        }
        else if (rear + 1 >= size)
            System.out.println("Overflow Exception");
        else if ( rear + 1 < size)
            Queue[++rear] = i;    
        len++ ;    
    }    
  
    public int remove() 
    {
        if (isEmpty())
           System.out.println("Underflow Exception");
        else 
        {
            len-- ;
            int ele = Queue[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            return ele;
        }        
    }
    
    public void display()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(Queue[i]+" ");
        System.out.println();        
    }
}	

public class QueuedArrayTest{
	public static void main(String args[]){
		QueuedArray q =new QueuedArray(10);
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.display();
		q.remove();
		q.display();
	}
}