package com.tcwgq.demo6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class ObjectStreamDemo {
	/**
	 * 序列化流：把对象按照流一样的方式写入文件或者在网络中传输。(ObjectOutputStream)
	 * 反序列化流：把文件中的对象数据或网络中的流对象数据还原成对象。(ObjectInputStream)
	 * 序列化：对象--流数据
	 * 反序列化：流数据--对象
	 * 
	 * @throws IOException 
	 */
	/**
	 * NotSerializableException:当实例需要具有序列化接口时，抛出此异常。序列化运行时或实例的类会抛出此异常。
	 * Serializable:类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
	 * 该接口没有任何方法，像这种没有方法的借口成为标记接口。
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException{
		FileOutputStream fos = new FileOutputStream("fos.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		User u = new User();
		u.setUsername("tcwgq");
		u.setPassword("112113");
		oos.writeObject(u);
		oos.close();
	}
	
	/**
	 * 反序列化
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	@Test
	public void fun1() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("fos.txt"));
		Object o = ois.readObject();
		System.out.println(o);
		ois.close();
	}

}
