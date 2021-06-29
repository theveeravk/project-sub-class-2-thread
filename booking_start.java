
public class booking_start {
	
      int totaltic =20;
	public  synchronized void wish(String name,int ticket) throws InterruptedException
	{
		if( totaltic >= ticket )
		{
			System.out.println("--------------------------------------");
			System.out.println(name+" ==> "+"yours ticket confirmed"+" No of tickets ==>"+ticket);
			  Thread.sleep(1000);
			System.out.println("yours ticket booked has successfully");
			System.out.println();
			System.out.println("--------------------------------------");
			
			totaltic = totaltic -ticket;
			Thread.sleep(1000);
			System.out.println("avilable tickets => "+totaltic);
			
			System.out.println("--------------------------------------");
			System.out.println("yours ticket booked has successfully");
		}
		else
		{
			System.out.println("--------------------------------------");
			System.out.println(name+" ==> "+"yours ticket not confirmed"+" No of tickets ==>"+ticket);
			System.out.println("--------------------------------------");
		}

	}

}
