package inheritance;

class ChangePassword
{
	String password = "pass@123";
	class EncryptPassword{
		int passwordLevel = 5;
		public void doEncrypt() {
			System.out.println("The password is : "+password);
		}
	}
}

public class DemoInnerclass {

	public static void main(String[] args) {
		ChangePassword pa = new ChangePassword();
		ChangePassword.EncryptPassword e = pa.new EncryptPassword();
		e.doEncrypt();
	}

}
