package com.tcwgq.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype1 implements Cloneable, Serializable {
	private static final long serialVersionUID = 351309870029339499L;
	private String name;
	private SerializableObject obj;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

	// 浅复制
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Prototype1 prototype = (Prototype1) super.clone();
		return prototype;
	}

	// 深复制
	public Object deepClone() throws IOException, ClassNotFoundException {
		// 写入当前对象的二进制流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(this);
		// 读取二进制流产生的新对象
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		return ois.readObject();
	}

}
