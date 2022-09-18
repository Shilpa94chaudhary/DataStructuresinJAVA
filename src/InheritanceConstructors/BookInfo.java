package InheritanceConstructors;

public class BookInfo {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Poem p = new Poem();
//		
//		p.setPrice(1800);
//		p.setAuthor("Shilpa");
//		p.setNoOfPages(250);
//		p.print();
		
		@SuppressWarnings("unused")
		ShortPoem sp = new ShortPoem();
//		sp.print();
		
		@SuppressWarnings("unused")
		ShortStory ss = new ShortStory("The Interruption","The Perfect Murder");
		
		LongStory a = new LongStory("The Count of Monte Cristo");
	    a.LongStory();
	}

}