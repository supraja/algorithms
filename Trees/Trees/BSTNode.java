package Trees;

public class BSTNode {
	
	private int value;
	private BSTNode left, right;
	
	public BSTNode(int value) {
		
		this.value = value;
		this.left = this.right = null;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}
	
}
