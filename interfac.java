package practise;

interface animal2{
	void sound();
}
class dog2 implements animal2{
	public void sound() {
		System.out.println("Bark");
	}
}

public class interfac {
	public static void main(String[] args) {
		dog2 d = new dog2();
		d.sound();
	}
}
