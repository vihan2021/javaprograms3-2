//program join method in threadin
package racecondition;
class Human extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is using the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is finished using  the bathroom");
			Thread.sleep(3000);
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
	}
}

public class JoinMethod {

	public static void main(String[] args)throws InterruptedException {
		Human h1=new Human();
		Human h2=new Human();
		Human h3=new Human();
		//Thread t1=new Thread(h1);while we using interface then we create thread class object (this code is for class)
		//Thread t2=new Thread(h2);
		//Thread t3=new Thread(h3);
		h1.setName("boy");
		h2.setName("girl");
		h3.setName("others");
		h1.start();
		h1.join();
		h2.start();
		h2.join();
		h3.start();
		h3.join();
		

	}

}
//output
boy has entered the bathroom
boy is using the bathroom
boy is finished using  the bathroom
girl has entered the bathroom
girl is using the bathroom
girl is finished using  the bathroom
others has entered the bathroom
others is using the bathroom
others is finished using  the bathroom


