package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumberOfNodesGreaterThanX {

	public static int numNodeGreater(TreeNode<Integer> root, int x) {

		if(root == null) {
			return 0;
		}
		int count = 0;
		Queue<TreeNode<Integer>> treeQueue = new LinkedList<TreeNode<Integer>>();
		treeQueue.add(root);
		while(!treeQueue.isEmpty()) {
			TreeNode<Integer> node = treeQueue.poll();
			if(node.data>x) {
				count++;
			}
			for(int i=0; i<node.children.size(); i++) {
				treeQueue.add(node.children.get(i));
			}
		}
		
		return count;
	}

	public static void main(String[] args) {

		TreeNode<Integer> tree = takeInpurLevelwise();
		System.out.println(numNodeGreater(tree,7));

	}

	// Take Tree input levelwise
	public static TreeNode<Integer> takeInpurLevelwise() {

		System.out.println("Enter a root: ");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(num);

		Queue<TreeNode<Integer>> treeQueue = new LinkedList<TreeNode<Integer>>();

		treeQueue.add(root);

		while (!treeQueue.isEmpty()) {

			TreeNode<Integer> node = treeQueue.poll();

			System.out.println("Enter the number of childer for " + node.data + ": ");
			int children = s.nextInt();
			if (children != 0)
				System.out.println("Enter the childer of " + node.data + ": ");
			for (int i = 0; i < children; i++) {
				int childData = s.nextInt();
				TreeNode<Integer> newNode = new TreeNode<Integer>(childData);
				node.children.add(newNode);
				treeQueue.add(newNode);
			}
		}

		return root;
	}

}
