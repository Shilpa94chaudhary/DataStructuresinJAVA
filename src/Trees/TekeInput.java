package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TekeInput {

	public static TreeNode<Integer> takeInpurRecursive() {
		// Take root node input
		System.out.println("Enter a node: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(num);
		
		System.out.println("Enter the number of children for : " + num + " ");
		int children = s.nextInt();
		
		for(int i = 1; i <= children ; i++) {
			TreeNode<Integer> node = takeInpurRecursive();
			root.children.add(node);
		}
		
		return root;
	}
	
	public static TreeNode<Integer> takeInpurLevelwise() {
		
		System.out.println("Enter a root: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(num);
		
		Queue<TreeNode<Integer>> treeQueue = new LinkedList<TreeNode<Integer>>();
		
		treeQueue.add(root);
		
		
		while(!treeQueue.isEmpty()) {
			
			TreeNode<Integer> node = treeQueue.poll();
			
			System.out.println("Enter the number of childer for " + node.data +": ");
			int children = s.nextInt();
			
			for(int i=0 ; i<children ; i++) {
				System.out.println("Enter the childer of " + node.data +": ");
				int childData = s.nextInt();
				TreeNode<Integer> newNode = new TreeNode<Integer>(childData);
				node.children.add(newNode);
				treeQueue.add(newNode);
			}
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		
//		TreeNode<Integer> tree = takeInpurRecursive();
//		printTree(tree);
		
		TreeNode<Integer> tree1 =takeInpurLevelwise();
		printTree(tree1);
		
	}
	
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

}
