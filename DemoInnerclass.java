package demo;

interface ChangePassword{
	void doChange();
}

public class DemoInnerclass {
	public static void main(String[] args) {
		ChangePassword c = new ChangePassword() {
			
			@Override
			public void doChange() {
				System.out.println("Password changed successfully!!!");				
			}
		};
		c.doChange();
	}
}
