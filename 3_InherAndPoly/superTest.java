public class superTest{
	public static void main(String[] args){
		
	}
}
class Person{
	private String name;
	public Person(String name)
	{
		this.name= name;
	}
	public void output()
	{
		System.out.println("Name:"+name);
	}
}

class Student extends Person{
	private int classID;
	public Student(String name,int classID)
	{
		super(name);
		this.classID = classID;
		
	}
	public void output()
	{
		super.output();
		System.out.println("ClassID:"+classID);
	}
}

