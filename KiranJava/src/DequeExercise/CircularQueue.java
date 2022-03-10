package DequeExercise;

public class CircularQueue {
    static final int MAX = 100;  
    int arr[];  
    int front;  
    int rear;  
    int size; 
    public CircularQueue(int size)  
    {  
       // The arr array is initialized with the MAX value defined earlier  
        arr = new int[MAX];  
        front = -1;  
        rear = 0;  
        this.size = size;  
    }   
    boolean isFull()  
    {  
        return ((front == 0 && rear == size-1)||  
            front == rear+1);  
    }  
    boolean isEmpty ()  
    {  
        return (front == -1);  
    }  
    void insertfront(int key)  
    {  
        // check whether Deque if full or not  
        if (isFull())  
        {  
            System.out.println("Overflow");  
            return;  
        }  
    if (front == -1)  
        {  
            front = 0;  
            rear = 0;  
        } 
        else if (front == 0)  
        front = size - 1 ;  

    else // decrement front end by '1'  
        front = front-1;  

    // insert current element into Deque  
    arr[front] = key ;  
}   
}
