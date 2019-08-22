package Hd;

public class Hdfcbank implements Parent1,Parent2{

	@Override
	public void password() {
System.out.println("the password is ");		
	}

	@Override
	public void user() {
System.out.println("the username is ");		
	}
	public static void main(String[] args) {
		Hdfcbank u = new Hdfcbank();
		u.password();
		u.user();
	}
}
