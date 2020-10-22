package coreJavaTraining;

public class India implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic a = new India();
		India b = new India();
		a.stopRed();
		a.goGreen();
		a.flashYellow();
		b.local();
		
	}

	@Override
	public void goGreen() {
		// TODO Auto-generated method stub
		System.out.println("Green implementation");
		
	}

	@Override
	public void stopRed() {
		System.out.println("Red implementation");
		
	}

	@Override
	public void flashYellow() {
		System.out.println("Yellow implementation");
		
	}
	
	public void local() {
		System.out.println("local method");
		
	}

}
