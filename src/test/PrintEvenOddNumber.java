package test;

public class PrintEvenOddNumber {
     int counter=1;
     static int n;
	public static void main(String[] args) {
		
		n=10;
		PrintEvenOddNumber obj = new PrintEvenOddNumber();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				obj.printOdd();
				
			}
		}, "Thread-1");

		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				obj.printEven();
				
			}
		}, "Thread-2");
		
		t1.start();
		t2.start();
	}
	
	public void printOdd() {
		
		synchronized (this) {
			while(counter<n) {
				while(counter%2==0) {
					
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName() + "  " + counter);
				counter++;
				notify();
			}
		}
	}

public void printEven() {
		
		synchronized (this) {
			while(counter<n) {
				while(counter%2!=0) {
					
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName() + "  " + counter);
				counter++;
				notify();
			}
		}
	}
	
}

