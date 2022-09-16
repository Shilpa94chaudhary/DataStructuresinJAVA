package ModifiersOne;

public class ClothUse1 {

	public static void main(String[] args) {
		Pants p = new Pants();
		p.gender = "Male";
		p.price = 1500;
		p.size = "M";
		p.setMaterial("Cotton");
		p.print();

	}

}
