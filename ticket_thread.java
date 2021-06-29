
public class ticket_thread extends Thread {
     
	booking_start bs;
	String name;
	int ticket;
	
	public ticket_thread(booking_start bs,String name,int ticket)
	{
		this.bs =bs;
		this.name=name;
		this.ticket=ticket;
	}

	public void run()
	{
		
	    try {
			bs.wish(name, ticket);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
