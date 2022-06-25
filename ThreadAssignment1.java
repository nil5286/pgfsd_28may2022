package program.jav.thread;

public class ThreadAssignment1  extends Thread {

	public void run(){  
		  for(int i=1;i<4;i++){  
		    try{
		    		Thread.sleep(4000);  // 4000 miliseconds = 4 secs
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
			System.out.println(Thread.currentThread().getName()+ "  :"+ i); 
			System.out.println("running thread name is:"+Thread.currentThread().getName());  // name of the thread
//			System.out.println("running thread priority is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getPriority());  //what is current prirotiy of thread
			System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  // it will print state of the thread running
//			System.out.println("The thread group is:" + Thread.currentThread().getName()+ " :::" + Thread.currentThread().getThreadGroup()); // a group in whihc thread is assgined
//			System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
			System.out.println("Is my thread Daemon or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isDaemon()); // this thread always run in background
			System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
			  
		  }  
		 }  
		 
		 public static void main(String args[]){  
		  ThreadAssignment1 t1=new ThreadAssignment1();  
		  t1.setName("Foreground");
		  t1.setPriority(MAX_PRIORITY); 
		  
		  ThreadAssignment1 t2=new ThreadAssignment1();  
		  t2.setName("Background");
		  t2.setPriority(Thread.NORM_PRIORITY); 
		  t2.setDaemon(true); 
		  
		  
		  ThreadAssignment1 t3=new ThreadAssignment1(); 
		  t3.setName("Normal");
		  t3.setPriority(Thread.NORM_PRIORITY);
		  
		   
		  t1.start();  
		  t2.start();  
		  t3.start();
		  
		  System.out.println(t1.getState());
		  System.out.println(t2.getState());
		  System.out.println(t3.getState());
		 }  
		}  
