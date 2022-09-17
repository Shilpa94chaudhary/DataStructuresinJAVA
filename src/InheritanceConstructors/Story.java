package InheritanceConstructors;

public class Story extends Book{
	String title;
	
	public Story(String title) {
		this.title = title;
		System.out.println("Story Constructor");
	}
	
}
