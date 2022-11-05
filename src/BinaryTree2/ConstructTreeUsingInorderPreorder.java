package BinaryTree2;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructTreeUsingInorderPreorder {

	/*
	 * PreOrder : 1 2 4 5 3 6 7 
	 * InOrder  : 4 2 5 1 6 3 7 
	 * Tree
	 * 		1 
	 * 	 2     3 
	 * 	4 5   6 7 
	 */
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		if(preOrder.length == 0) {
			return null;
		}
		if(preOrder.length == 1){
			BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preOrder[0]);
			return root;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preOrder[0]);

		int leftArrSize = 0;

		for(int i = 0; i < preOrder.length ; i++){
			if(inOrder[i] == preOrder[0]){
				leftArrSize = i;
				break;
			}
		}

		int leftArrPre[] = new int [leftArrSize];
		int lettArrIn[] = new int [leftArrSize];
		int rightArrPre[] = new int [preOrder.length - leftArrSize - 1];
		int rightArrIn[] = new int [preOrder.length - leftArrSize - 1];

		for(int i=0 ; i < leftArrSize ; i++) {
			leftArrPre[i] = preOrder[i+1];
			lettArrIn[i] = inOrder[i];
		}

		for(int i=0 ; i < rightArrIn.length ; i++) {
			rightArrPre[i] = preOrder[leftArrSize + i + 1];
			rightArrIn[i] = inOrder[leftArrSize + i + 1];
		}

		root.left = buildTree(leftArrPre,lettArrIn);
		root.right = buildTree(rightArrPre,rightArrIn);

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

//		int preOrder[] = {1, 2, 4, 5, 3, 6, 7};
//		int inOrder[] = {4, 2, 5, 1, 6, 3, 7};
//		BinaryTreeNode<Integer> root = buildTree(preOrder,inOrder);
//		printLevelWise(root);
		
		int preOrder[] = {8, 3, 1, 6, 4, 7, 10, 14, 13};
		int inOrder[] = {1, 3, 4, 6, 7, 8, 10, 13, 14};
		BinaryTreeNode<Integer> root = buildTree(preOrder,inOrder);
		printLevelWise(root);
	}

}
