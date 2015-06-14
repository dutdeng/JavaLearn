public class multiThread{
	public static void main(String[] args) throws InterruptedException {
		Runnable t1 = new task1();
		Runnable t2 = new task2();
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		Thread tt3 = new newThread();
		
		tt1.start();
		tt2.start();
		tt3.start();
	}
}

class newThread extends Thread{
	public void run(){
		for(int i =0;i<10;i++){
			System.out.println("3_1");
			try{
				Thread.sleep(50);
			}catch(InterruptedException e)
			{}
		}
	}
}

class task1 implements Runnable{
	public void run()
	{
		for(int i =0;i<10;i++){
			System.out.println("1_1");
			try{
				Thread.sleep(50);
			}catch(InterruptedException e)
			{}
		}
	}
}
class task2 implements Runnable{
	public void run()
	{
		for(int i =0;i<10;i++){
			System.out.println("2_2");
			try{
				Thread.sleep(50);
			}catch(InterruptedException e)
			{}
		}
	}
}



