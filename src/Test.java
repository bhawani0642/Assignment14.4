
public class Test {
public static void main(String[] args) {
	//Making the object of Thread class
			 Thread t= new Thread( new DaemonTest());
			 Thread t1= new Thread(new DaemonTest());
			 //Setting t thread as Daemon
			
			 t.setDaemon(true);
			
			 //Calling the start method
			 t.start();
			 
			 t1.start();
			 
		

		}

	
	}


