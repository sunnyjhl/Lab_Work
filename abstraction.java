package practise;
//Abstraction
abstract class vehicle{
	abstract void start();
	void stop() {
		System.out.println("Stop");
	}
}
class car extends vehicle{
	void start() {
		System.out.println("Car starts");
	}
}

public class abstraction {
	public static void main(String[] args) {
		car c = new car ();
		 c.start(); //CarStarts
		 c.stop();  //Stop
	}
}
