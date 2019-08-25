/* When one serialized class extends another non serialized class and during serialization set the primitive value
 * for both classes then once we de-serialized the super class object then what's attribute the value of
 * sub class variables    
 * */

package com.cms.serialization.Ex2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedDemo {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Chandra";
		p.sid = 11;
		p.designation = "Developer";
		p.userId = "cmsharma";
		p.password = "12345";
		
		try {
			System.out.println("SERIALIZATION OF PERSON Started..");
			FileOutputStream fout = new FileOutputStream("/tmp/person.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(p);
			out.close();
			fout.close();
			System.out.println("SERIALIZATION OF PERSON Completed..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
