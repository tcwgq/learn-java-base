package com.tcwgq.demo3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class DOM4JDemo {
	public static void main(String[] args) throws DocumentException, IOException {
		writeEncoding();
	}

	public static void read() throws DocumentException {
		SAXReader sr = new SAXReader();
		InputStream is = DOM4JDemo.class.getClassLoader().getResourceAsStream("dom4j.xml");
		Document document = sr.read(is);
		Element university = document.getRootElement();
		Attribute universityAttribute = university.attribute("name");
		System.out.println(universityAttribute.getText());
		List<?> collegeNodes = university.elements();
		Iterator<?> collegeIt = collegeNodes.iterator();
		while (collegeIt.hasNext()) {
			Element college = (Element) collegeIt.next();
			Attribute collegeAttribute = college.attribute("name");
			System.out.println("\t" + collegeAttribute.getText());
			List<?> classesNodes = college.elements();
			Iterator<?> classesIt = classesNodes.iterator();
			while (classesIt.hasNext()) {
				Element classes = (Element) classesIt.next();
				Attribute classesAttribute = classes.attribute("name");
				System.out.println("\t\t" + classesAttribute.getText());
				List<?> studentNodes = classes.elements();
				Iterator<?> studentIt = studentNodes.iterator();
				while (studentIt.hasNext()) {
					Element student = (Element) studentIt.next();
					Attribute nameAttribute = student.attribute("name");
					Attribute sexAttribute = student.attribute("sex");
					Attribute ageAttribute = student.attribute("age");
					String name = nameAttribute.getText();
					String sex = sexAttribute.getText();
					String age = ageAttribute.getText();
					System.out.println("\t\t\t" + name + "--" + sex + "--" + age);
				}
			}
		}
	}

	public static void write() throws DocumentException, IOException {
		SAXReader sr = new SAXReader();
		InputStream is = DOM4JDemo.class.getClassLoader().getResourceAsStream("dom4j.xml");
		Document document = sr.read(is);
		XMLWriter writer = new XMLWriter(new FileWriter("write.xml"));
		writer.write(document);
		writer.close();
	}

	public static void writeEncoding() throws DocumentException, IOException {
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8");
		SAXReader sr = new SAXReader();
		InputStream is = DOM4JDemo.class.getClassLoader().getResourceAsStream("dom4j.xml");
		Document document = sr.read(is);
		XMLWriter writer = new XMLWriter(new FileWriter("output.xml"), format);
		writer.write(document);
		writer.close();
	}
}