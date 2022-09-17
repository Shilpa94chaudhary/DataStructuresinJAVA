package InheritanceConstructors;

public class ShortStory extends Story{
	String storyName;
	
	public ShortStory(String storyName, String title) {
		
		/* There is no default constructor in Story (Parent Class) so if we do not
		 * call the Constructor with parameter we will get an error
		 */
		super(title);
		this.storyName = storyName;
		System.out.println("ShortStory Construcor");
	}
}
