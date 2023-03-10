package serialization;
import java.lang.ClassNotFoundException;
import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Mainclasstoread {
     public static void main(String[] args) throws  Exception, ClassNotFoundException {
    	 Employee e1=new Employee(23,"sheldon",2500.0);
         File f2=new File("D:\\JAVA PROJECTS\\quantum\\entanglement1.ser");
         
       	 FileInputStream f1=new FileInputStream("D:\\JAVA PROJECTS\\quantum\\entanglement1.ser");
         ObjectInputStream o=new ObjectInputStream(f1);
         Employee emp=null;
		try {
			emp = (Employee)o.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
         System.out.println(emp.id);
         System.out.println(emp.name);
         System.out.println(emp.salary);
         o.close();
         f1.close();
         
         
	}
}