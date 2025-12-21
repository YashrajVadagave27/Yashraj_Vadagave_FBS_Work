package p1;

class Worker1 implements Runnable //it used when your worker class is extended by any other class
{

	@Override
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
public class Test2 {
	public static void main(String[] args) {
		
		Worker1 w1 = new Worker1();
		Thread t1 = new Thread(w1);
		t1.start();
		
		String str = "abcdefghijklmnopqr";
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
