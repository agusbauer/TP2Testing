package tp2;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserialization {

	public ObjectInputStream ois;

	public Deserialization(String file) throws FileNotFoundException, IOException{
		FileInputStream fileTestUnit = new FileInputStream(new File(file));
		ois= new ObjectInputStream(fileTestUnit);
	}
 
	 public  ArrayList<Server> deserialize(){
		 ArrayList<Server> servers = new ArrayList<Server>(); 
		 try{
			 Server server = (Server) nextObject(); 
			 while(server != null){
				 servers.add(server); 
				 server = (Server) nextObject();
			 }
		 }catch (Exception e) {
			 e.printStackTrace();
		 } 
		 return servers;
	 }
  
	 private Object nextObject() throws ClassNotFoundException, IOException {
		 try {
			 return ois.readObject();
		 } catch (EOFException eof) {
			 return null;
		 } catch (ClassNotFoundException e) {
			 throw e;
		 } catch (IOException e) {
			 throw e;
		 }
	 }
 
}