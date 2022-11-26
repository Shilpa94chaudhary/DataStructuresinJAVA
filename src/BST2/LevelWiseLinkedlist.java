package BST2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelWiseLinkedlist {

	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root) {

		ArrayList<LinkedListNode<Integer>> ans = new ArrayList<>();
		
		if (root == null)
			return ans;
		
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		
		q.offer(root);
		
		while (!q.isEmpty()) {
			int size = q.size();
			LinkedListNode<Integer> level = new LinkedListNode<Integer>(0);
			LinkedListNode<Integer> head = null;
			while (size-- > 0) {
				BinaryTreeNode<Integer> temp = q.poll();
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);
				if (head == null) {
					LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(temp.data);
					level = newNode;
					head = newNode;
				} else {
					LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(temp.data);
					level.next = newNode;
					level = level.next;
				}
			}
			ans.add(head);
		}
		return ans;
	}

}
