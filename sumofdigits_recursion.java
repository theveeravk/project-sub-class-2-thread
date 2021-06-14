
public class sumofdigits_recursion {

	public static void main(String[] args) 
	{
		int no =81 ;
		sumofdigits_recursion vk = new  sumofdigits_recursion();
		int result= vk.sumofdigits(no);
		System.out.println(result);

	}

	private int sumofdigits(int no)
	{
		if(no!= 0)
		{
			return no%10 +sumofdigits(no/10);
		}
		else
		return 0;
		
	}

}
