package BinaryTree2;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructTreeUsingInorderPostOrder {

	/*
	 * PostOrder : 4 5 2 6 7 3 1 
	 *   left post : 4 5 2
	 *   right post : 6 7 3
	 * InOrder  : 4 2 5 1 6 3 7   
	 *   left in : 4 2 5 
	 *   right in : 6 3 7
	 * Tree
	 * 		1 
	 * 	 2     3 
	 * 	4 5   6 7 
	 */

	public static BinaryTreeNode<Integer> buildTreeHelper(int in[], int post[], int inStrt,
			int inEnd, int postStrt, int postEnd){

		if (inStrt > inEnd ||postStrt>postEnd )  {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(post[postEnd]);

		int leftInSize = 0;
		for(int i = inStrt; i<=inEnd ; i++) {

			if(in[i] == post[postEnd]) {
				break;
			}
			leftInSize++;
		}

		int rightInSize = postEnd - postStrt - leftInSize;

		int inStrtL = inStrt;
		int inEndL = inStrt+leftInSize-1;
		int postStrtL = postStrt; 
		int postEndL = postStrt+leftInSize-1;
		int inStrtR = inEndL + 2;
		int inEndR = inStrtR + rightInSize -1;
		int postStrtR = postEndL + 1;
		int postEndR = postEnd-1;

		root.left = buildTreeHelper(in, post, inStrtL, inEndL, postStrtL, postEndL);
		root.right = buildTreeHelper(in, post, inStrtR, inEndR, postStrtR, postEndR);
		return root;
	}


	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		
		if(postOrder.length == 0) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = buildTreeHelper(inOrder,postOrder,0, inOrder.length-1,0,postOrder.length-1);

		return root;
	}

	// Levelwise print binary tree
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();

		queue.add(root);
		while(!queue.isEmpty()) {

			BinaryTreeNode<Integer> printNode = queue.poll();
			System.out.print(printNode.data + ":");
			if(printNode.left == null) {
				System.out.print("L:-1,");
			}else {
				System.out.print("L:" + printNode.left.data+ ",");
				queue.add(printNode.left);
			}

			if(printNode.right == null) {
				System.out.print("R:-1");
			}else {
				System.out.print("R:" + printNode.right.data);
				queue.add(printNode.right);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int postOrder[] = {4,5,2,6,7,3,1};
		int inOrder[] = {4,2,5,1,6,3,7};
		BinaryTreeNode<Integer> root = buildTree(postOrder,inOrder);
		printLevelWise(root);

		//		int postOrder[] = {8, 3, 1, 6, 4, 7, 10, 14, 13};
		//		int inOrder[] = {1, 3, 4, 6, 7, 8, 10, 13, 14};
		//		BinaryTreeNode<Integer> root = buildTree(postOrder,inOrder);
		//		printLevelWise(root);
	}

}
