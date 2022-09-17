package InheritanceConstructors;

public class BookInfo {

	public static void main(String[] args) {
		Poem p = new Poem();
//		
//		p.setPrice(1800);
//		p.setAuthor("Shilpa");
//		p.setNoOfPages(250);
//		p.print();
		
		ShortPoem sp = new ShortPoem();
//		sp.print();
		
		ShortStory ss = new ShortStory("The Interruption","The Perfect Murder");
		
		LongStory a = new LongStory("The Count of Monte Cristo");
	    a.LongStory();
	}

}