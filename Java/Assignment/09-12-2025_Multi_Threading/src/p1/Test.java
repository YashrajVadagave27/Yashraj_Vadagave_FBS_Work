package p1;

class Worker extends Thread //it used when your worker class is not extended by any other class
{
	public void run() {
		String str = "1234567890987654321";
		for(int i=0; i<str.length(); i++) {
			
			try {
				System.out.print(" "+str.charAt(i));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Test {
	public static void main(String[] args) {
//		Worker w1 = new Worker();
//		w1.run();
		
		Worker w1 = new Worker();
		w1.start();
		
		String str = "abcdefghijklmnopqr";
		for(int i=0; i<str.length(); i++) {
			
			try {
				System.out.print(" "+str.charAt(i));
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		Worker w1 = new Worker();
//		w1.start();
		
	}
}
