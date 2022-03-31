package com.velocity.mock.design;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize implements Serializable {

	public static void main(String[] args) {

		try {
			SingletonDesign sDesign = SingletonDesign.checkObject();
			ObjectOutput output = new ObjectOutputStream(
					new FileOutputStream("C:\\Users\\hp\\OneDrive\\Desktop\\IO Stream\\Demo.txt"));
			output.writeObject(sDesign);

			ObjectInput input = new ObjectInputStream(
					new FileInputStream("C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\IO Stream\\\\Demo.txt"));
			SingletonDesign sDesign2=(SingletonDesign) input.readObject();
			
			System.out.println(sDesign);
			System.out.println(sDesign2);
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
