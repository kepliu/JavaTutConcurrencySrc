package javaTut;

public class HelloThread extends Thread{
	private String name;
	public HelloThread(String name){
		this.name = name;
	}
	@Override
    public void run() {
        (new HelloRunnable(this.name)).runIt();
    }

	public static void main(String[] args) throws InterruptedException {
		Thread a = new HelloThread("a");
		a.start();
		Thread b= new HelloThread("b");
		b.start();
		a.join();
		b.join();
		//Thread.sleep(6000);
		for (String s: HelloRunnable.list){
			System.out.println(s);
		}
	}

}
