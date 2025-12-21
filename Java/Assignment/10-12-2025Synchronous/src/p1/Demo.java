//package p1;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Demo {
//	public static void main(String[] args) {
//		Thread t1 = new Thread() {
//		public void run() {
//			try {
//				BufferedReader b1 = new BufferedReader(new FileReader("E:\\Java\\Assignment\\10-12-2025Synchronous\\src\\p1\\first.txt"));
//					
//				String line = null;
//				try {
//					while((line = b1.readLine())!= null) {
//						try {
//							Thread.sleep(1000);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						System.out.println(line);
//					}
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		};
//		
//		Thread t2 = new Thread() {
//			public void run() {
//				try {
//					BufferedReader b1 = new BufferedReader(new FileReader("E:\\Java\\Assignment\\10-12-2025Synchronous\\src\\p1\\last.txt"));
//						
//					String str = null;
//					try {
//						while((str = b1.readLine())!= null) {
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//							System.out.println(str);
//						}
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			};
//			t1.start();
//			t2.start();			
//	}
//
//}
//
//

package p1;

import java.io.BufferedReader;
import java.io.FileReader;

class NameBuffer {
    private String firstName;
    private String lastName;

    // Called by first-name thread
    synchronized void setFirstName(String name) throws InterruptedException {
        while (firstName != null) {
            wait();
        }
        firstName = name;
        notify();
    }

    // Called by last-name thread
    synchronized void setLastName(String name) throws InterruptedException {
        while (lastName != null) {
            wait();
        }
        lastName = name;
        notify();
    }

    // Print only when BOTH are present
    synchronized void printFullName() throws InterruptedException {
        while (firstName == null || lastName == null) {
            wait();
        }
        System.out.println(firstName + " " + lastName);

        firstName = null;
        lastName = null;
        notifyAll();
    }
}

public class Demo {

    public static void main(String[] args) {

        NameBuffer buffer = new NameBuffer();

        // Thread for FIRST names
        Thread t1 = new Thread(() -> {
            try (BufferedReader br = new BufferedReader(
                    new FileReader("E:\\Java\\Assignment\\10-12-2025Synchronous\\src\\p1\\first.txt"))) {

                String line;
                while ((line = br.readLine()) != null) {
                    buffer.setFirstName(line);
                    buffer.printFullName();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Thread for LAST names
        Thread t2 = new Thread(() -> {
            try (BufferedReader br = new BufferedReader(
                    new FileReader("E:\\Java\\Assignment\\10-12-2025Synchronous\\src\\p1\\last.txt"))) {

                String line;
                while ((line = br.readLine()) != null) {
                    buffer.setLastName(line);
                    
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}


