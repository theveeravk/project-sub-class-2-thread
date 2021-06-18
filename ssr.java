
public class ssr {

	public static void main(String[] args)
	{
		String name = "veera kumar";
		System.out.println(name.charAt(0));
		
	
		System.out.println("///////////codePointAt() method/////////");
		System.out.println(name.codePointAt(0));
        System.out.println();
		
        System.out.println("///////////codePointCount() method/////////");
        System.out.println(name.codePointCount(1 , 4));
        System.out.println();
        
        System.out.println("///////////offsetByCodePoints() method/////////");
        System.out.println(name.offsetByCodePoints(1 , 4));
        System.out.println();
        
        
		
		
        System.out.println("///////////compareToIgnoreCase() method/////////");
		String b= "Veera";
		System.out.println(name.compareToIgnoreCase(b));
		System.out.println("///////////concat() method/////////");
        System.out.println(name.concat(" vasu"));
        System.out.println();
        
        System.out.println("///////////contains() method/////////");
        System.out.println(name.contains("veera"));
        System.out.println(name.contains("vasu"));
        System.out.println();
        
        System.out.println("///////////equals() method/////////");
        System.out.println(name.equals("veera"));
        System.out.println();
        
        String name4 ="Veera";
        System.out.println("/////////// equalsIgnoreCase() method/////////");
        System.out.println(name. equalsIgnoreCase(name4));
        System.out.println(name. equalsIgnoreCase("Veera Kumar"));
        System.out.println();
        
        System.out.println("///////////contentEquals() method/////////");
        System.out.println(name.contentEquals("veera kumar"));
        System.out.println(name.contentEquals("veera"));
        System.out.println(name.contentEquals("Veera"));
        
        System.out.println();
        
       
        System.out.println("/////////// copyValueOf() method/////////");
        char[] n = {'v','e','e'};
        String name2 = "";
        name2 = name2.copyValueOf(n,0,3);
        System.out.println(name2);
        System.out.println();
      
        System.out.println("///////////endsWith() method/////////");
        System.out.println(name.endsWith("eera"));
        System.out.println();
        
        System.out.println("/////////// format() method/////////");
        System.out.println(name. format("name is %s",name));
        System.out.println();
        
        System.out.println("/////////// getBytes() method/////////");
        byte[] bs = name.getBytes();
        for(int i =0;i<bs.length;i++)
        {
        	System.out.println((char)bs[i]);
        }
        System.out.println();
        
        char[] ch = new char[10];  
        try{  
           name.getChars(0, 5, ch,2);  
           System.out.println(ch);  
        }catch(Exception ex){System.out.println(ex);}  
        System.out.println();
        
        System.out.println("///////////indexOf() method/////////");
        System.out.println(name.indexOf('v'));
        System.out.println(name.indexOf("kumar"));
        System.out.println();
        
        System.out.println("///////////lastIndexOf() method/////////");
        System.out.println(name.lastIndexOf('a'));
        System.out.println();
        
      
        System.out.println("///////////matches() method/////////");
        String name7 ="veera kumar";
        System.out.println(name.matches(name7));

        System.out.println();
        
        System.out.println("///////////regionMatches() method/////////");
        System.out.println(name. regionMatches(0,name7,0,8));
        System.out.println();
        
        System.out.println("///////////replace() method/////////");
        System.out.println(name. replace('e','a'));
        System.out.println();
       
        System.out.println("///////////replaceAll() method/////////");
        System.out.println(name. replaceAll("veera","vasu"));
        System.out.println();
        
        
        System.out.println("///////////replaceFirst() method/////////");
        String name8 = "veera veera veera";
        System.out.println(name8. replaceFirst("veera","vasu"));
        System.out.println();
        
        System.out.println("///////////endsWith() method/////////");
        System.out.println(name.endsWith("kumar"));
        System.out.println();
        
        System.out.println("///////////endsWith() method/////////");
        System.out.println(name.startsWith("kumar"));
        System.out.println(name.startsWith("veera"));
        System.out.println();
        
       
        System.out.println("///////////endsWith() method/////////");
        String name22 = "";
        System.out.println(name.isEmpty());
        System.out.println(name22.isEmpty());
        System.out.println();
        
        
        System.out.println("///////////length() method/////////");
        System.out.println(name.length());
        System.out.println();
        
        System.out.println("///////////toUpperCase and toLowerCase method/////////");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println();
        
        System.out.println("///////////trim() method/////////");
        String name34 = "       Hello veera!        ";
        System.out.println(name34);
        System.out.println(name34.trim());
        System.out.println();
        
        
        System.out.println("///////////trim() method/////////");
        int value=30;  
        String s1=String.valueOf(value);  
        System.out.println(s1+80);
        System.out.println();
        
        System.out.println("///////////trim() method/////////");
        String ss1=new String("hello");  
        String ss2="hello";  
        String ss3=ss1.intern();
        System.out.println(ss1==ss2) ;
        System.out.println(ss2==ss3);
        System.out.println();
        
        System.out.println("///////////trim() method/////////");
        String ns="veerakumar";  
        System.out.println(ns.substring(2,4));
        System.out.println(ns.substring(2));
        
        
        
        String name10 = "veera@gmail.com;vk@gmail.com";
        String[] arrOfStr = name10.split(";",2);
        System.out.println();
        
   
        for (String a : arrOfStr)
            System.out.println(a);
        
      
       
        
        
        
        
        
        
        
        

	}

}
