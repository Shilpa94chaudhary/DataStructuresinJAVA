package BST1Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BSTtoLL {

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return null;
		}

		LinkedListNode<Integer> head = constructLLHelper(root).head;

		return head;

	}

	public static LLPAir constructLLHelper(BinaryTreeNode<Integer> root){

		if(root == null) {
			return null;
		}
		LLPAir result = new LLPAir();
		LinkedListNode<Integer> node = new LinkedListNode<Integer> (root.data);

		if(root.left == null && root.right == null) {
			result.head = node;
			result.tail = node;
			return result;
		}

		LLPAir leftPair = constructLLHelper(root.left);
		LLPAir rightPair = constructLLHelper(root.right);

		if(leftPair == null && rightPair != null) {
			result.head = node;
			node.next = rightPair.head;
			result.tail = rightPair.tail;
		}else if(leftPair != null && rightPair == null) {
			result.head = leftPair.head;
			leftPair.tail.next = node;
			result.tail = node;
		}else {
			result.head = leftPair.head;
			result.tail = rightPair.tail;
			leftPair.tail.next = node;
			node.next = rightPair.head;
		}


		return result;
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
		LinkedListNode<Integer> head = constructLinkedList(root);
		printRecursive(head);
	}

	// Print elements of Linked List
	public static void printRecursive(LinkedListNode<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printRecursive(head.next);
	}

}
