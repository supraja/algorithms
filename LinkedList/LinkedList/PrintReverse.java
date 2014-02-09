package LinkedList;

class LLNode {
	int value;
	LLNode next;
	
	LLNode(int value) {
		this.value = value;
		this.next = null;
	}
}

public class PrintReverse {
	
	private static void printReverse(LLNode head) {
		
		if(null == head)
			return;
		printReverse(head.next);
		System.out.println(head.value);

	}
	
	public static void main(String[] args) {
		
		LLNode head = new LLNode(10);
		head.next = new LLNode(13);
		head.next.next = new LLNode(8);
		head.next.next.next = new LLNode(1);
		printReverse(head);
		
	}

}
