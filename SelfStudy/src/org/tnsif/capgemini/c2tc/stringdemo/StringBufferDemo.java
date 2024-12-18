package org.tnsif.capgemini.c2tc.stringdemo;

public class StringBufferDemo 
{
  public static void main(String[] args) 
  {
		StringBuffer buffer=new StringBuffer("Start\n");
		
		//create the first thread
		Thread thread1=new Thread(()->{
			buffer.append("Message from thread1\n");
			
		});
		
		//create the second thread
				Thread thread2=new Thread(()->{
					buffer.append("Message from thread2\n");
					
		});
		thread1.start();
	   thread2.start();
	   
	   try
	   {
		   thread1.join();//wait here until the thread1 is done
		   thread2.join();//wait here until the thread2 is done
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   System.out.println("Final StringBuffer  "+buffer.toString());
	}

}
