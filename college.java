//Inner class calling from non static methods
public class college {

	 static String principalname = "veera";
	 int fee = 30000;
	 boolean uniform = false;
	 int fine =1;
	 
	public static void main(String[] args) 
	{
		college principal = new college();
		//college.dept hod = principal.new dept();
		//hod.function();
		principal.meetingHod();

	}
	public void meetingHod()
	{
		dept hod = new dept();
		hod.function();
		
	}
    class dept
    {
    	int fine = 2;
    	boolean uniform = true;
    	public void function()
    	{ 
    		int fine = 1000;
    		System.out.println(this.fine);
    		System.out.println(fine);
    		System.out.println(college.this.uniform);
    		System.out.println(college.this.fine);
    		System.out.println(uniform);
    		System.out.println(fee);
    		System.out.println("cs department function");
    	}
    }
}
