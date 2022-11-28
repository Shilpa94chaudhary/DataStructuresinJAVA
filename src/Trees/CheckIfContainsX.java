package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckIfContainsX {

	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		if(root == null) {
			return false;
		}
		if(root.data == x) {
			return true;
		}
		
		boolean result = false;
		for(int i = 0; i < root.children.size() ; i++) {
			boolean childResult = checkIfContainsX(root.children.get(i),x);
			result = result | childResult;
		}
		return result;
	}
	
	public static void main(String[] args) {
		TreeNode<Integer> tree = takeInpurLevelwise();
		System.out.println(checkIfContainsX(tree,17));
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
