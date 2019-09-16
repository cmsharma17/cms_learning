package comc.cms.designPattern.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class DemoSingletonTestWithSerialization {
	static DemoSingleton instanceOne = DemoSingleton.getInstance();
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		//Serialize to a file
		FileOutputStream fout = new FileOutputStream("/tmp/demoSingleton.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(instanceOne);
		out.close();
		fout.close();
		instanceOne.setI(20);
		
		//DeSerialize to a file
		FileInputStream fin = new FileInputStream("/tmp/demoSingleton.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		DemoSingleton instanceTwo = (DemoSingleton)in.readObject();
		in.close();
		fin.close();
		
		System.out.println(instanceOne.getI());
		System.out.println(instanceTwo.getI());
		
	}
}
