package javaTut;

import java.util.ArrayList;
import java.util.List;

public class HelloRunnable implements Runnable {//test git test git 2
	public static List<String> list = new ArrayList<String>();
	private String name;
	private int n;
	public HelloRunnable(){
		
	}
	public HelloRunnable(String thread){
		this.name = thread;
	}
	@Override
	public void  run() {
		synchronized(this){
		if (this.name.equals("a")){
			for (int i=1; i<=100; i++){
			//	synchronized(list){
				list.add("a");
			//	}
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if (this.name.equals("b")){
			for (int i=1; i<=100; i++){
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	//			synchronized(list){
					list.add("b");
	//			}
				
			}
			
		}
		}

	}
	public void  runIt() {
		//synchronized(this){
		if (this.name.equals("a")){
			for (int i=1; i<=100; i++){
			//	synchronized(list){
				list.add("a");
			//	}
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if (this.name.equals("b")){
			for (int i=1; i<=100; i++){
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	//			synchronized(list){
					list.add("b");
	//			}
				
			}
			
		}
		//}

	}

	public static void main(String[] args) throws InterruptedException {
		(new Thread(new HelloRunnable("a"))).start();
		(new Thread(new HelloRunnable("b"))).start();
		Thread.sleep(5000);
		for (String s: list){
			System.out.println(s);
		}
	}

}
