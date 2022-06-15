package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9021367298794424953L;

	public int a;
	public String b;

	public Demo(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}

}

public class SerialTest {

	public static void main(String[] args) {

		Demo d = new Demo(10, "Abhijeet");
		String fileName = "abc.ser";

		try {

			FileOutputStream fs = new FileOutputStream(fileName);
			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(d);
			os.close();
			fs.close();

			System.out.println("Object Serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}

		Demo d1 = null;

		try {
			FileInputStream is = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(is);

			d1 = (Demo) ois.readObject();
			ois.close();
			is.close();

			System.out.println("Object deserialised");
			System.out.println(d1.a);
			System.out.println(d1.b);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
