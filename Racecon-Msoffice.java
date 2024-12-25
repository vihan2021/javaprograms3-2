//program for raceconditions(ex:Msoffice)
package racecondition;
 class MicroSoft implements Runnable {
	public  void  typing() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("thread typing");
				Thread.sleep(3000);
			}
			
		}
		catch( InterruptedException e) {
			e.printStackTrace();
	}
	}
	public  void spellcheck() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("spell checking");
				Thread.sleep(3000);
			}
		}
			catch( InterruptedException e1) {
				e1.printStackTrace();
		}
	}
	public void saving() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("thread saving");
				Thread.sleep(3000);
			}
			
		}
		catch( InterruptedException e3) {
			e3.printStackTrace();
	}
		
	}
	public  void run() {
		if(Thread.currentThread().getName().equals("typing"))
		{
			typing();
			
		}
		else if(Thread.currentThread().getName().equals("spellcheck")) {
			spellcheck();
			
		}
		else {
			saving();
		}
	}
}

	
class MSOffice{
	public static void main(String[] args) throws InterruptedException{
		MicroSoft m1= new MicroSoft ();
		MicroSoft  m2= new MicroSoft ();
		MicroSoft  m3= new MicroSoft ();
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		Thread t3=new Thread(m3);
		t1.setName("typing");
		t2.setName("spellcheck");
		t3.setName("saving");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();

		
	}
}
