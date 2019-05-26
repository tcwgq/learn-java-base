package com.tcwgq.xml.test;

import java.io.File;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 字符串与XML的转换
 */
public class Test1 {
	public static void main(String[] args) {

	}

	public static void stringToXML() throws DocumentException {
		String text = "<csdn><java>Java班</java></csdn>";
		Document document = DocumentHelper.parseText(text);
	}

	public static void xmlToString() throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("csdn.xml"));
		Element root = document.getRootElement();
		String docXmlText = document.asXML();
		String rootXmlText = root.asXML();
		Element memberElm = root.element("csdn");
		String memberXmlText = memberElm.asXML();
	}
}
