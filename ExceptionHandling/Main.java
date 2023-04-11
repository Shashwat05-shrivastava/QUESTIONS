package ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		int x=10;
		if(x<18) {
			throw new YoungerAgeException("Age is not an issue");
		}else {
			System.out.println("Perfact");
		}

	}

}
