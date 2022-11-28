package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindHeight {

	public static int getHeight(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		
		// If root is null height will be 0
		if(root == null) {
			return 0;
		}
		
		int height = 0;
		
		for(int i = 0 ; i< root.children.size(); i++) {
			int childHeight = getHeight(root.children.get(i));
			if(height < childHeight) {
				height = childHeight;
			}
		}
		
		height ++;
		
		return height;
	}
	
	public static void main(String[] args) {

		TreeNode<Integer> tree = takeInpurLevelwise();
		System.out.println(getHeight(tree));

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
