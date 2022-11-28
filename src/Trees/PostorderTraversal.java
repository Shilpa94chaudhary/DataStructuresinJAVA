package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PostorderTraversal {

	public static void printPostOrder(TreeNode<Integer> root){
		
		/*
		 * Post Order
		 * Input: 5 3 1 2 3 2 4 5 3 6 7 8 1 9 0 0 0 0 0 0 
		 * Tree: 
		 *          5
		 *    1     2    3
		 *   4 5  6 7 8   9
		 *   
		 * Output: 
		 * 4 5 1 6 7 8 2 9 3 5
		 */
		
		if(root == null) {
			return;
		}
		for(int i = 0; i < root.children.size() ; i++) {
			printPostOrder(root.children.get(i));
		}
		System.out.print(root.data + " ");
	}
	
	public static void main(String[] args) {
		TreeNode<Integer> tree = takeInpurLevelwise();
		printPostOrder(tree);
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
