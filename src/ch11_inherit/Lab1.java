package ch11_inherit;

class Human{
	String name;
	int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Class - Human: "+name+"/"+age;
	}
	public String getProfession() {
		return null;
	}
}

class Student extends Human{
	String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString()+"/"+major;
	}
	@Override
	public String getProfession() {
		return major;
	}
}


public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human("ÃáÇâ",18);
		Human h2 = new Human("¸ù·æ",21);
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		
		Student s1 = new Student("¸íÁø",21,"ÄÄÇ»ÅÍ");
		System.out.println(s1.toString());
		System.out.println(s1.getProfession());
	}

}
