
public class String_reve {

	public static void main(String[] args)
	{
		
		String name = "Hi am veera kumar";
		String[] name2 = name.split(" ");
		String n ="";
		
		for(int i =0;i<name2.length;i++)
		{
			System.out.print(name2[i] +" ");
		}
		System.out.println();
		for(int i =name2.length-1;i>=0;i--)
		{
			n = n +name2[i]+" ";
		}
		System.out.println(n);

	}

}
