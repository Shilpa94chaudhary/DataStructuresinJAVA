package BST2;

public class LargestBST {

	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		Pair ans = largestBSThelper(root);
        return ans.height;
    }

	public static Pair largestBSThelper(BinaryTreeNode<Integer> root){
        if(root == null){
            Pair output = new Pair();
            output.max = Integer.MIN_VALUE;
            output.min = Integer.MAX_VALUE;
            output.isBST = true;
            output.height = 0;
            return output;
        }
        
        Pair left  = largestBSThelper(root.left);
        Pair right = largestBSThelper(root.right);
        
        Pair output = new Pair();
        
        int min = Math.min(root.data,Math.min(left.min,right.min));
        int max = Math.max(root.data,Math.max(left.max,right.max));
        
        output.min = min;
        output.max = max;
        
        output.isBST = left.max < root.data && right.min > root.data 
                       && left.isBST && right.isBST;
        
        if(output.isBST){
            output.height = Math.max(left.height,right.height) + 1;
        }else{
            output.height = Math.max(left.height,right.height);
        }
        
        return output;   
    }
	
}
