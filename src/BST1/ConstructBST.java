package BST1;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructBST {

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		if(n==0) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = arrayToBSTHelper(arr, 0, n-1);
		
		return root;
		
	}
	
	public static BinaryTreeNode<Integer> arrayToBSTHelper(int[] arr, int sI, int eI){
		
		if(sI > eI) {
			return null;
		}
		int mid = (sI+eI)/2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
		
		root.left = arrayToBSTHelper(arr, sI, mid-1);
		root.right = arrayToBSTHelper(arr, mid+1, eI);
		
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
		
		int arr[] = {1,2,3,4,5,6,7,8};
		BinaryTreeNode<Integer> root = SortedArrayToBST(arr, arr.length);
		printLevelWise(root);
		
	}

}
