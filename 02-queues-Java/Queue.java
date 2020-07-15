public class Queue{
	int[] storage = new int[20];
	int front;
	int rear;
	public Queue(int head){
		front = 0;
		rear = 0;
		storage[rear++] = head;
	}
	
	public void enqueue(int new_ele){
		storage[rear++] = new_ele;
	}

	public int peek(){
		
		return storage[front];
	}

	public int dequeue(){
		int p = storage[front++]; 
		// for(int i = front ; i < rear ; i++){
		// 	storage[i] = storage[i+1];
		// }
		return p;
	}
}