public class BST {
	private BSTNode root;

	/**
	 * Inserts the value into the binary search tree
	 */
	public void insert(int number) {
		if(root == null) {
			root = new BSTNode(number);
		} else {
			root.insert(number);
		}
	}

	/**
	 * Returns the smallest value in the tree (or -1 if tree is empty)
	 */
	public int min() {
		throw new UnsupportedOperationException("Not implemented, yet");
	}

	/**
	 * Returns the largest value in the tree (or -1 if tree is empty)
	 */
	public int max() {
		throw new UnsupportedOperationException("Not implemented, yet");
	}

	/**
	 * Returns how many levels deep the deepest level in the tree is
	 * (the empty tree is 0 levels deep, the tree with only one root node is 1 deep)
	 * @return
	 */
	public int depth() {
		throw new UnsupportedOperationException("Not implemented, yet");
	}

	/**
	 * Returns the amount of values in the tree
	 * @return
	 */
	public int count() {
		throw new UnsupportedOperationException("Not implemented, yet");
	}

	/**
	 * Print all the values in the tree in order
	 */
	public void print() {
		throw new UnsupportedOperationException("Not implemented, yet");
	}

	public static void main(String args[]) {
		BST tree = new BST();
		tree.insert(50);
		tree.insert(2);
		tree.insert(7);
		tree.insert(94);
		tree.insert(24);
		tree.insert(24);
		tree.insert(71);
		tree.insert(30);
		tree.insert(49);
		System.out.println("Count: " + tree.count()); // Should be 9
		System.out.println("Min: " + tree.min()); // Should be 2
		System.out.println("Max: " + tree.max()); // Should be 94
		System.out.println("Depth: " + tree.depth()); // Should be 7
		tree.print(); // Prints the values in order
	}
}
