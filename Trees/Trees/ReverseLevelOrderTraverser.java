package Trees;

/**
* Print given Binary Tree level after level 
* 
* Level Order Traversal
* Also prints Reverse Level Order
*
*/
public class ReverseLevelOrderTraverser {
	
	private static BSTNode root;
	
	private static void printReverseLevelOrder(BSTNode root) {
		
		int height = getHeight(root);
		System.out.println("Height of tree: " + height);
		
		for(int l = 1; l <= height; l++) {
			
			if(l == 1)
				System.out.println(root.getValue());
			
			else	
				printLevel(root, l);
		}
	}
	
	private static void printLevel(BSTNode parent, int level) {
		
		if(null == parent)
			return;
			
		if(level == 1)
			System.out.println(parent.getValue());
	
		printLevel(parent.getLeft(), level - 1);
		printLevel(parent.getRight(), level - 1);
	}

	private static int getHeight(BSTNode root) {
				
		if(null == root)
			return 0;
		
		return max(getHeight(root.getLeft()) + 1, getHeight(root.getRight()) + 1);
	}
	
	private static int max(int h1, int h2) {
		
		if(h1 > h2)
			return h1;
		else
			return h2;
	
	}

	public static void main(String[] args) {
		
		root = new BSTNode(13);
		root.setLeft(new BSTNode(6));
		root.setRight(new BSTNode(20));
		root.getLeft().setRight(new BSTNode(11));
		root.getLeft().getRight().setLeft(new BSTNode(7));
		root.getRight().setLeft(new BSTNode(17));
		
		printReverseLevelOrder(root);
		
	}

}
