package tutorialsPoint;

class PrintDemo {
	private String threadName;
	public void setName(String name){
		threadName = name;
		System.out.println("setName: " + name);
	}
   public  void  printCount(){ //synchronized
    try {
         for(int i = 5; i > 0; i--) {
        	 Thread.sleep(30);
            System.out.println(" Counter   ---   "  + i );
         }
     } catch (Exception e) {
         System.out.println("Thread  interrupted.");
     }
   }

}