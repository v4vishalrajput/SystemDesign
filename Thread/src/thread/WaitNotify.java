package thread;

public class WaitNotify {
	
	public static void main(String[] args) {
	 SharedMemory res = new SharedMemory();
	 Thread t1 = new Thread(()->{
		 
			 try {
				 System.out.println("t1 executing...");
				 for(int i=0;i<10;i++)
				res.producer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	 });
	 
	 Thread t2 = new Thread(()->{
		
			 try {
				 System.out.println("t2 executing...");
				 for(int i=0;i<10;i++)
				res.consumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	 });
	 
	 
	 Thread t3 = new Thread(()->{
		
			 try {
				 System.out.println("t3 executing...");
				 for(int i=0;i<10;i++)
				res.consumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	 });
	 
	 t2.start(); 
	 t1.start();
	 t3.start();

	 
	}

}

 class SharedMemory{
	  volatile int curr=0;
	  int max=10;

	 public synchronized void producer() throws InterruptedException {
	 	
	 	while(curr==max) {
	 		System.out.println(Thread.currentThread().getName()+" producer going in wait state");
	 		wait();
	 	}
	 	
	 	curr++;
	 	System.out.println("Item produced "+ curr);
	 	Thread.sleep(500);
	 	
	 	notifyAll();
	 	
	 }
	 
	 public synchronized void consumer() throws InterruptedException {
		 while(curr==0) {
			 System.out.println(Thread.currentThread().getName()+" going in wait state");
			 wait();
		 }
		 
		 curr--;
		 System.out.println(curr+1 + " Item consumed by "+Thread.currentThread().getName());
//		 Thread.sleep(500);
		 notifyAll();
	 }
	 
}
