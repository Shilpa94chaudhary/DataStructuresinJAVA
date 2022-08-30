package OOPS1;

public class Dog {

	String name;
	String bread;
	int age;
	String color;
	
	public Dog(String name, String bread, int age, String color){
		this.name=name;
		this.bread=bread;
		this.age=age;
		this.color=color;
	}
	
	public void printMyData() {
		System.out.println("My name is "+this.name+". My bread, age and color are "+this.bread+", "+this.age+", and "+this.color);
	}
	
	public static void main(String arg[]) {
		Dog tuffy = new Dog("Tuffy","popillon",2,"white");
		tuffy.printMyData();
		Dog laila = new Dog("Laila","Golden Retriever",1,"white");
		laila.printMyData();
	}
}
