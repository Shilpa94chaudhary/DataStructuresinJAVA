package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MaxSumNode {

	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		
		if(root == null) {
			return root;
		}
		
		TreeNode<Integer> maxSumNode = maxSumNodeHelper(root).node;
		return maxSumNode;
		
	}
	
	public static maxSumNodeHelperClass maxSumNodeHelper(TreeNode<Integer> node){
		int childNodeSum = node.data;
		
		for(int i = 0 ; i < node.children.size(); i++) {
			childNodeSum += node.children.get(i).data;
		}
		
		maxSumNodeHelperClass result = new maxSumNodeHelperClass(node,childNodeSum);
		
		for (int i = 0; i < node.children.size(); i++) {	
			maxSumNodeHelperClass child = maxSumNodeHelper(node.children.get(i));
			if(child.childrenSum > result.childrenSum) {
				result = child;
			}
		}
		
		return result;
	}
	
	// 5 3 1 2 3 2 4 5 3 6 7 8 1 9 0 0 0 0 0 0 
	public static void main(String[] args) {
		TreeNode<Integer> tree = takeInpurLevelwise();
		System.out.println(maxSumNode(tree).data);
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
