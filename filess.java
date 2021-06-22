import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;


public class filess {

	public static void main(String[] args) throws IOException
	{
	   File f = new  File("C:\\Users\\ELCOT\\Desktop\\sample\\veer.jpg");
	   
	FileInputStream fi = new FileInputStream(f);
	FileOutputStream fo = new FileOutputStream("C:\\Users\\ELCOT\\Desktop\\sample\\v.jpg");
	
	int content = fi.read();
	while(content != -1)
	{
		fo.write(content);
		content = fi.read();
    	 
     }
	fo.flush();
	fo.close();
     
	}

}
