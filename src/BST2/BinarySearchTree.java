package BST2;

public class BinarySearchTree {
	public void insert(int data) {
		//Implement the insert() function
		 root=insertHelper(root,data);
	}
	
	public void remove(int data) {
		//Implement the remove() function
		root= deleteHelper(root,data);
	}
	
	public void printTree() {
		//Implement the printTree() function
		printHelper(root);
        return;
	}
	
	public boolean search(int data) {
		//Implement the search() function
		return searchHelper(root,data);
	}
	
	private static BinaryTreeNode<Integer> root;
   
    //     ----search
    private static boolean searchHelper(BinaryTreeNode<Integer> root,int data){
        if(root==null)
            return false;
        if(root.data==data)
            return true;
        else if(root.data>data)
            return searchHelper(root.left,data);
        else 
            return searchHelper(root.right,data);

    }

    //    ----insert
    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root,int data)
    {
        if(root==null)
        {
            BinaryTreeNode<Integer> node= new BinaryTreeNode<>(data);
            return node;
        }
        if(data>root.data)
        {
            BinaryTreeNode<Integer> rightcall=insertHelper(root.right,data);
            root.right=rightcall;
        }
        else if(data<=root.data)
        {
            BinaryTreeNode<Integer> leftcall=insertHelper(root.left,data);
            root.left=leftcall;
        }

        return root;
    }



    // -----printTree
    private static void printHelper(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return ;
       // String s=root.data+":";
        System.out.print(root.data+":");
        if(root.left!=null)
            // s=s+"L:"+root.left.data+",";
            System.out.print("L:"+root.left.data+",");
        if(root.right!=null){
        // s=s+"R:"+root.right.data;
            System.out.print("R:"+root.right.data);
        }
        // System.out.println(s);
        System.out.println();
        printHelper(root.left);
        printHelper(root.right);
        return;
    }


    // ------delete
    private static BinaryTreeNode<Integer> deleteHelper(BinaryTreeNode<Integer> root,int data){
        if(root==null)
            return null;
        if(root.data==data){
            if(root.left!=null && root.right==null)
                return root.left;
            else if(root.left==null && root.right!=null)
                return root.right;
            else if(root.left==null && root.right==null)
                return null;
            else{
                // int rootData=minimum(root.right);
                //  BinaryTreeNode<Integer> newNode= deleteHelper(root,rootData);

                BinaryTreeNode<Integer> minNode = root.right;
                while (minNode.left != null) {
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = deleteHelper(root.right,minNode.data);
                return root;
            }

        }
        else if(root.data>data)
        {BinaryTreeNode<Integer> leftt=deleteHelper(root.left,data);
         root.left=leftt;}
        else{
            BinaryTreeNode<Integer> rightt=deleteHelper(root.right,data);
            root.right=rightt;  
        }

        return root;
    }
}
