
public class Thread_run implements Runnable {
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Hi @");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_run r1=new Thread_run();
		Thread t=new Thread(r1);
		t.start();

	}

}
