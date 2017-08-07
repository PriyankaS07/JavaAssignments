class StackedArray {
	int arr[];
	int top;
	int size;
	int len;

	public StackedArray(int n){
		size=n;
		len=0;
		arr=new int[size];
		top=-1;
	}

	public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
    	return top == size-1;
    }

    public int getSize(){
    	return len;
    }


    public void push(int i){
        if(top + 1 < size )
            arr[++top] = i;
        len++ ;
    }

    public int pop(){
        len-- ;
        return arr[top--]; 
    } 

    public void display(){
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }    
}

public class StackedArrayTest{

	public static void main(String args[]){
		StackedArray stk = new StackedArray(10);
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.display();
		stk.pop();
		stk.display();
	}
}