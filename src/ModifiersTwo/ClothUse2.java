package ModifiersTwo;

public class ClothUse2 {

	public static void main(String[] args) {
		
		Shirts s = new Shirts();
		s.gender = "Female";
		s.price = 2000;
		s.size = "M";
		s.setMaterial("Cotton");
		s.print();

	}
}
