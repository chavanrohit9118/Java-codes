package lab7july2022;

/*
 Is it possible to start a thread twice? Explain with a code.
=> No ,it is not possible to start a thread twice
 */


public class Twice_thread extends Thread {

	
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("Start generated");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Twice_thread t=new Twice_thread();
		t.start();
		t.start();
		
	}

}
