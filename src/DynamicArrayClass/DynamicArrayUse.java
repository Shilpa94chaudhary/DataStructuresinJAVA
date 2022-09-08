package DynamicArrayClass;

public class DynamicArrayUse {

	public static void main(String[] args) {
		
		DynamicArray d = new DynamicArray();
		
		for(int i = 1; i < 5 ; i++) {
			d.add(100+i);
			System.out.println(d.size());
			System.out.println(d.getElementAt(i-1));
			}

		System.out.println(d.size());
		System.out.println(d.getElementAt(3));
		d.setElementAt(2,150);
		System.out.println(d.getElementAt(2));
		
		while(! d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("Size: " + d.size());
		}
	}

}
