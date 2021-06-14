
public class lcm_rec {

	public static void main(String[] args)
	{
		
        int no1 = 4; int no2 =2;
        int mul = no1*no2;
        int lcm =0;
       
        lcm_rec vk = new lcm_rec();
       int result = vk.Lcm(no1,no2,mul,lcm);
       
        
        System.out.println(result);
	}

	private int Lcm(int no1,int no2,int mul,int lcm) 
	{
		
     
      
        if(mul%no1==0 && mul%no2 ==0)
        {
        	lcm = mul;
        	
        }
        mul--;
        if(mul >1)
        {
        	return Lcm( no1, no2, mul,lcm );
        }
	    
        return lcm;
	}

}
