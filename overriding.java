package practise;

class animal{
	void sound() {
		System.out.println("Animal");
	}
}

class dog extends animal{
	@Override
	void sound() {
		System.out.println("Bark");
	}
}

public class overriding {
	public static void main(String[] args) {
		 dog d = new dog();
		 animal a = new animal();
		 d.sound();
	}
}
