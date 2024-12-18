program for interthread communication (even or aodd)
package Day10;

class oddeven implements Runnable{

    static int c = 1;
    Object obj = new Object();

     @Override
     public void run() {
         try{
             while (c<=10){
                 synchronized (obj){

                 if(c%2==0 && Thread.currentThread().getName().equals("Even")){
                          System.out.println("Thread name : "+Thread.currentThread().getName()+"Value : "+c);
                         Thread.sleep(2000);
                         c++;
                         obj.notify();
                         obj.wait();
                     
                 }else if(c%2!=0 && Thread.currentThread().getName().equals("Odd")){
                     
                         System.out.println("Thread name: "+Thread.currentThread().getName()+"Value: "+c);
                         Thread.sleep(2000);
                         c++;
                         obj.notify();
                         if (c <= 10) { // Avoid unnecessary waiting at the end
                             obj.wait();
                         
                     }
                 }
             }

         }
                 
         }catch (InterruptedException e){
             e.printStackTrace();
         } finally {
        	 System.out.println("I have done it");
         }

         }   
 }


public class Main {
    public static void main(String[] a){
        oddeven oe = new oddeven();
Thread t1 = new Thread(oe);
Thread t2 = new Thread(oe);
t1.setName("Even");
t2.setName("Odd");
t1.start();
t2.start();
    }
}
output:Thread name: OddValue: 1
Thread name : EvenValue : 2
Thread name: OddValue: 3
Thread name : EvenValue : 4
Thread name: OddValue: 5
Thread name : EvenValue : 6
Thread name: OddValue: 7
Thread name : EvenValue : 8
Thread name: OddValue: 9
Thread name : EvenValue : 10
I have done it

