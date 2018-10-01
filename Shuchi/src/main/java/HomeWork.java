  
public class HomeWork {

	void logingTest () {
		System.out.println("Log In homework");
	}
	
	static void logingTest1 () {
		System.out.println("I submitted Homework");
	}
	
	int sum () {
	int a=2; 
	int b=23;
	int sum = a+b;
	return sum;
	
	}
	public static void main(String[] args) {
		
		HomeWork.logingTest1();
		
		HomeWork obj = new HomeWork ();
		obj.logingTest();
		
		
	}

}
