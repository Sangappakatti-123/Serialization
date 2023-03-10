package serialization;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Mainclass {
     public static void main(String[] args) throws IOException {
    	 Employee e1=new Employee(23,"sheldon",2500.0);
         File f2=new File("D:\\JAVA PROJECTS\\quantum\\entanglement1.ser");
         
       	 FileOutputStream f1=new FileOutputStream("D:\\JAVA PROJECTS\\quantum\\entanglement1.ser");
         ObjectOutputStream o=new ObjectOutputStream(f1);
         o.writeObject(e1);
         o.close();
         f1.close();
         
         
	}
}
