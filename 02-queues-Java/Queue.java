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
		if(front == rear){
			storage[rear] = new_ele;
			rear++;
		}
		else{
			storage[rear++] = new_ele;
		}
	}

	public int peek(){
		
		return storage[rear];
	}

	public int dequeue(){
		int p = storage[rear--]; 
		return p;
	}
}