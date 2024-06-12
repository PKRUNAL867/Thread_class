class Thread1 extends Thread
{
	@Override 
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Hello");
		}
	}
	
	public static void main(String[] args) {
		Thread1  th=new Thread1();
		th.start();
	}

}



