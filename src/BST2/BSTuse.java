package BST2;

public class BSTuse {

	public static void main(String[] args) {

		BST b = new BST();

		b.insert(5);
		b.insert(2);
		b.insert(7);
		b.insert(1);
		b.insert(3);
		b.insert(6);
		b.insert(8);
		b.insert(4);

		b.printTree();

		System.out.println("5 is present in tree: " + b.isPresent(5));

		System.out.println("5 is deleted from tree: " + b.deleteData(5));

		System.out.println("5 is present in tree: " + b.isPresent(5));

		System.out.println("5 is deleted from tree: " + b.deleteData(5));

		b.printTree();

	}

}
