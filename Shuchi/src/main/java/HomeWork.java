
public class HomeWork {

	void logingTest () {
		System.out.println("Log In homework");
	}
	
	static void logingTest1 () {
		System.out.println("I submitted Homework");
	}
	
	public static void main(String[] args) {
		
		HomeWork.logingTest1();
		
		HomeWork obj = new HomeWork ();
		obj.logingTest();
		
	}

}
