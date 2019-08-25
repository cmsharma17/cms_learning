package com.cms.serialization.Ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedDemo {
	
	public static void main(String[] args) {
		Person p = null;
		try {
			FileInputStream fin = new FileInputStream("/tmp/person.ser");
			ObjectInputStream oin = new ObjectInputStream(fin);
			p = (Person)oin.readObject();
			oin.close();
			fin.close();
		} catch ( IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Deserialized Person and Login Details");
		System.out.println("Name::"+p.name);
		System.out.println("SID::"+p.sid);
		System.out.println("UserId::"+p.userId);
		System.out.println("Password::"+p.password);

	}

}
