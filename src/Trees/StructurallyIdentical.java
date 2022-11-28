package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StructurallyIdentical {

	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		if (root1 != null && root2 == null) {
			return false;
		} else if (root1 == null && root2 != null) {
			return false;
		} else if (root1 == null && root2 == null) {
			return true;
		}

		if (root1.data == root2.data) {
			if (root1.children.size() == root2.children.size()) {
				// Check equal condition for all children
				boolean result = true;
				for (int i = 0; i < root1.children.size(); i++) {
					boolean resultChildren = checkIdentical(root1.children.get(i), root2.children.get(i));
					result = result & resultChildren;
				}
				return result;

			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		TreeNode<Integer> tree1 = takeInpurLevelwise();
		TreeNode<Integer> tree2 = takeInpurLevelwise();
		System.out.println(checkIdentical(tree1, tree2));
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
