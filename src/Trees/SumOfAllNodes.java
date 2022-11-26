package Trees;

public class SumOfAllNodes {

	public static int sumOfAllNode(TreeNode<Integer> root){
		if(root == null) {
			return 0;
		}
		int sum = root.data;
		for(int i = 0 ; i < root.children.size() ; i++) {
			sum += sumOfAllNode(root.children.get(i));
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println(sumOfAllNode(tree));

	}

}