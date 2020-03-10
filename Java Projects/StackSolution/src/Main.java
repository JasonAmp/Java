
public class Main {

	public static void main(String[] args) {
		System.out.println("Stack: ");

		Stack stack = new Stack();
		stack.Insert(3);
		stack.Insert(4);
		stack.Insert(1);
		stack.Insert(2);
		stack.Insert(5);
		stack.Pop();
		stack.DisplayStack();
		System.out.println("Queue: ");
		Queue queue = new Queue();
		queue.Enqueue(1);
		queue.Enqueue(2);
		queue.Enqueue(3);
		queue.Enqueue(7);
		queue.Enqueue(7);
		queue.Enqueue(7);
		queue.Enqueue(5);
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();




		queue.DisplayQueue();


	




	}

}
