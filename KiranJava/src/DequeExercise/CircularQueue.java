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
}
