package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintLevelwise {

	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		
		if(root == null) {
			return;
		}
		
		Queue<TreeNode<Integer>> treeQueue = new LinkedList<>();
		treeQueue.add(root);
		
		
		Queue<TreeNode<Integer>> treeSubQueue = new LinkedList<>();
		System.out.print(root.data +"\n");
		while(!treeQueue.isEmpty()) {
			TreeNode<Integer> node = treeQueue.poll();
			
			for(int i=0 ; i< node.children.size(); i++) {
				treeSubQueue.add(node.children.get(i));
			}
			
			if(treeQueue.isEmpty()) {
				while(!treeSubQueue.isEmpty()) {
					TreeNode<Integer> newNode = treeSubQueue.poll();
					System.out.print(newNode.data + " ");
					treeQueue.add(newNode);
				}
				System.out.println();
			}
		}
	}
		
//	5 3 1 2 3 2 4 5 0 3 6 7 8 1 9 0 0 0 0 0 
//	5 3 1 2 3 2 4 5 3 6 7 8 2 9 10 0 1 11 1 12 0 0 0 0 0 0 
	/*
	 *           5
	 *   1       2       3
	 *  4 5    6 7 8    9 10
	 *     11 12 
	 */
	public static void main(String[] args) {
		
		TreeNode<Integer> tree =takeInpurLevelwise();
		printLevelWise(tree);

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
			if(children != 0)
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
