package bstempty;

public class BSTNode {
	private int number;

	private BSTNode left;
	private BSTNode right;

	public BSTNode(int number) {
		this.number = number;
	}

	/**
	 * Add a number in the subtree of this node
	 */
	public void insert(int number) {
		if(number < this.number) {
			// Smaller value, insert it into the left subtree
			if(this.left == null) {
				this.left = new BSTNode(number);
			} else {
				this.left.insert(number);
			}
		} else {
			// Larger value, insert it in the right subtree
			if(this.right == null) {
				this.right = new BSTNode(number);
			} else {
				this.right.insert(number);
			}
		}
	}

	public void prettyprint(String firstPrefix, String prefix) {
		System.out.println(firstPrefix + number);

		if (right == null) {
			System.out.println(prefix + "├── .");
		} else {
			right.prettyprint(prefix + "├── ", prefix + "|   ");
		}

		if (left == null) {
			System.out.println(prefix + "└── .");
		} else {
			left.prettyprint(prefix + "└── ", prefix + "    ");
		}
	}
}
