package practise;

class student{
	String name;
	int rolln;
	int age;
	
	student(String name, int rolln, int age){
		this.name = name;
		this.age=age;
		this.rolln=rolln;
	}
}	

public class constructor {	
	public static void main(String[] args) {
		student s = new student("Jayaditya", 101, 22);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.rolln);
	}

}
