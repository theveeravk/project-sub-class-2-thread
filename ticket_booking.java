import java.util.Scanner;

public class ticket_booking {

	public static void main(String[] args) throws InterruptedException
	{
		
		booking_start bs = new booking_start();
		Scanner vk = new Scanner(System.in);
		System.out.println("enter a how many bookers");
		int no = vk.nextInt();
		int[] num = new int[no];
		
         
		String[] name = new String[no];
		
		for(int i =0;i<num.length;i++)
		{
			System.out.println("enter a customer name");
			name[i] = vk.next();
			System.out.println("enter a no of tickets");
			num[i]= vk.nextInt();
			
			
		}
		for(int i =0;i<num.length;i++)
		{
			
			ticket_thread tt= new ticket_thread(bs,name[i],num[i]);
			tt.start();
		}
		
		
		
		
	    
		
		
		
		
		
		

	}

}
