package Trees;

public class PrintTree {

	// Print tree : Pre-Order
	public static void printTree(TreeNode<Integer> root) {

		if (root == null) {
			// Special case not base case
			return;
		}
		System.out.print(root.data + ":");
		for (int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data + ",");
		}
		System.out.println();
		for (int i = 0; i < root.children.size(); i++) {	
			printTree(root.children.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		TreeNode<Integer> tree = new TreeNode<>(4);
		TreeNode<Integer> node1 = new TreeNode<>(6);
		TreeNode<Integer> node2 = new TreeNode<>(3);
		TreeNode<Integer> node3 = new TreeNode<>(7);
		TreeNode<Integer> node4 = new TreeNode<>(2);
		TreeNode<Integer> node5 = new TreeNode<>(9);
		TreeNode<Integer> node6 = new TreeNode<>(10);

		// Add node1, node2, node3 to children of tree
		tree.children.add(node1);
		tree.children.add(node2);
		tree.children.add(node3);

		// Add node4, node5 to children of node2
		node2.children.add(node4);
		node2.children.add(node5);
		node5.children.add(node6);

		printTree(tree);

	}

}
