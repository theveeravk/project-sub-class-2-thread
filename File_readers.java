import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class File_readers {

	public static void main(String[] args) throws IOException
	{
	   File f = new  File("C:\\Users\\ELCOT\\Desktop\\sample\\vk03.txt");
	   
	 FileWriter fw = new FileWriter(f,true);
	   fw.append("veerask");
	   fw.flush();
	   fw.close();
     FileReader fr = new FileReader(f);
     
     int content = fr.read();
     while(content!=-1)
     {
    	 System.out.println((char)content);
    	content = fr.read();
    	 
     }
     
	}

}
