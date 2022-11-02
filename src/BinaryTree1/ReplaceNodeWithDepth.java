package BinaryTree1;

public class ReplaceNodeWithDepth {

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	   if(root == null) {
		   return;
	   }
	   changeNodeDepthTree(root,0);
	}
	
	public static void changeNodeDepthTree(BinaryTreeNode<Integer> root, int depth) {
		if(root == null) {
			   return;
		}
		
		root.data = depth;
		changeNodeDepthTree(root.left,depth+1);
		changeNodeDepthTree(root.right,depth+1);
		
	}
	
	public static void main(String[] args) {
		char ch='a';
		if(ch>70) {
			System.out.println("yes");
		}

	}

}
