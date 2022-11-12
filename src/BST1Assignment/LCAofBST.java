package BST1Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LCAofBST {

	/*
	 * 8 4 12 2 5 10 14 1 3 6 7 9 11 13 15 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 
	 */
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root==null) {
			return -1;
		}

		int rusult = -1;
		if(root.data==a || root.data==b) {
			return root.data;
		}else if(a<root.data && b>root.data || a>root.data && b<root.data){

			rusult=getLCA(root.left,a,b);
			int d=getLCA(root.right,a,b);
			if(rusult==-1 && d==-1)
				return -1;
			else if(rusult==-1 && d!=-1)
				return  d;
			else if(rusult!=-1 && d==-1)
				return rusult;
			else
				return root.data;

		}else if(a<root.data &&b<root.data){
			rusult=getLCA(root.left,a,b);
		}else if(a>root.data &&b>root.data){
			rusult=getLCA(root.right,a,b);
		}

		if(rusult!=-1)
			return rusult;
		else
			return -1;

	}

	// Take binary tree input
	private static BinaryTreeNode<Integer> levelwiseInput() {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data : ");
		int data = s.nextInt();
		if(data == -1) {
			return null;
		}

		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();

		BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(data);
		queue.add(node);
		while(!queue.isEmpty()) {

			BinaryTreeNode<Integer> temp = queue.poll();

			System.out.println("Enter left of " + temp.data + " : ");
			data = s.nextInt();
			if(data == -1) {
				temp.left = null;
			}else {
				BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(data);
				queue.add(left);
				temp.left = left;
			}

			System.out.println("Enter right of " + temp.data + " : ");
			data = s.nextInt();
			if(data == -1) {
				temp.right = null;
			}else {
				BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(data);
				queue.add(right);
				temp.right = right;
			}
		}

		return node;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = levelwiseInput();
		System.out.println(getLCA(root,2,6));

	}

}
