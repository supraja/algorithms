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
	
	private static LLNode merge(LLNode head1, LLNode head2) {
	
	        if(head1 == null) return head2;
	        else if(head2 == null) return head1;
	
	        if(head1.value < head2.value) {
	            head1.next = merge(head1.next, head2);
	            return head1;
	        }
	        else {
	            head2.next = merge(head2.next, head1);
	            return head2;
	        }
	}
	
	public static void main(String[] args) {
		
		LLNode head = new LLNode(2);
		head.next = new LLNode(4);
		head.next.next = new LLNode(6);
		head.next.next.next = new LLNode(8);
		printReverse(head);
		
		LLNode head1 = new LLNode(1);
		head1.next = new LLnode(3);
		merge(head, head1);
		
	}

}
