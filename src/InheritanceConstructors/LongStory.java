package InheritanceConstructors;

public class LongStory extends Story{

	public LongStory(String title) {
		super(title);
		System.out.println("LongStory Constructor with Params");
	}
	
	public void LongStory() {
		System.out.println("Default LongStory");
	}

}
