
public class reverse_recurson {

	public static void main(String[] args) 
	{
		int no = 12345;
		
		reverse_recurson vk = new reverse_recurson();
		int result =vk.reverse(no);
		System.out.println(result);
		
	}

	private int reverse(int no) 
	{
		
		System.out.println(no%10);
		no = no/10;
		if(no!=0)
			return reverse( no);
		else
		return  no;
		
	}

}
