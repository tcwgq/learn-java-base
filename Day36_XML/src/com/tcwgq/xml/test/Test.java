package com.tcwgq.xml.test;

import java.io.FileWriter;
import java.io.IOException;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

/**
 * XML文件的新建与CRUD操作
 */
public class Test {
	public static void main(String[] args) throws IOException {
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement("person");
		Element child1 = root.addElement("student");
		child1.addAttribute("name", "zhangSan");
		child1.addAttribute("age", "13");
		Element child2 = root.addElement("student");
		child2.addAttribute("name", "liSi");
		child2.addAttribute("age", "21");
		XMLWriter writer = new XMLWriter(new FileWriter("new.xml"));
		writer.write(document);
		writer.close();
	}
}
