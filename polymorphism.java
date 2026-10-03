package practise;

class animal1{
	void sound() {
		System.out.println("Animal");
	}
}
class dog1 extends animal1{
	void sound() {
		System.out.println("Brak!");
	}
}

public class polymorphism {
	public static void main(String[] args) {
		animal1 a = new dog1();
		a.sound();
	}
}
