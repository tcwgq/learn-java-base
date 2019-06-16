package com.tcwgq.demo;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMDemo {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// 获得dom解析器工厂（工作的作用是用于创建具体的解析器）
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// System.out.println(dbf.getClass().getName());
		// 获得具体的dom解析器
		DocumentBuilder db = dbf.newDocumentBuilder();
		// System.out.println(db.getClass().getName());
		// 解析一个xml文档，获得Document对象（根结点）
		InputStream is = DOMDemo.class.getClassLoader().getResourceAsStream("dom.xml");
		Document document = db.parse(is);
		NodeList list = document.getElementsByTagName("student");
		for (int i = 0; i < list.getLength(); i++) {
			String name = document.getElementsByTagName("name").item(i).getFirstChild().getNodeValue();
			String age = document.getElementsByTagName("age").item(i).getFirstChild().getNodeValue();
			System.out.println(name + "--" + age);
		}
	}
}
