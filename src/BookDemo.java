import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookDemo {

	public static void main(String[] args) {
		// for writing an object we need to use ObjectOutputStream;
		
		ObjectOutputStream out  = null;
		try {
			out =  new ObjectOutputStream(new FileOutputStream("Book.dat"));
			Book b1  = new Book(101 ,"Chem " ,120.0f);
			Book b2  = new Book(121 ,"emiment " ,1200.0f);
			Book b3  = new Book(131 ,"right ",12.0f);
			out.writeObject(b1); // it will throws a runtime unchecked error 
			out.writeObject(b2); 
			out.writeObject(b3);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				out.close();
				
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ObjectInputStream in  =null;
		  try {
				in =  new ObjectInputStream(new FileInputStream("C:\\Users\\703247241\\eclipse-workspace\\GenpactDay5\\Book.dat"));
				try {
					Book bx = (Book)(in.readObject());
					bx.display();
					bx = (Book)(in.readObject());
					bx.display();
				}
				catch(ClassNotFoundException c) {
					c.printStackTrace();
				}
		  }
		  catch(IOException e) {
			  e.printStackTrace();
			  
			  
		  }
		  try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		
		
		

	}

}
