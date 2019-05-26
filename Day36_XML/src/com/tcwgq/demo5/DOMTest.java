package com.tcwgq.demo5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 注意4种解析方法对TextNode（文本节点）的处理：
 * 1.在使用DOM时，调用node.getChildNodes()获取该节点的子节点，文本节点也会被当作一个Node来返回。
 * 2.使用SAX来解析同DOM，当你重写它的public void characters(char[] ch, int start, int
 * length)方法时，你就能看到。
 * 3.JDOM，调用node.getChildren()只返回子节点，不包括TextNode节点（不管该节点是否有Text信息）。
 * 如果要获取该节点的Text信息，可以调用node.getText()方法，该方法返回节点的Text信息，也包括\n\t等特殊字符。
 * 4.DOM4j同JDOM
 */
public class DOMTest {

	public static void main(String[] args) {
		read();
	}

	public static void read() {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = dbf.newDocumentBuilder();
			InputStream in = DOMTest.class.getClassLoader().getResourceAsStream("test.xml");
			Document doc = builder.parse(in);
			// root <university>
			Element root = doc.getDocumentElement();
			if (root == null)
				return;
			// System.err.println(root.getAttribute("name"));
			// all college node
			NodeList collegeNodes = root.getChildNodes();
			if (collegeNodes == null)
				return;
			System.err.println("university子节点数：" + collegeNodes.getLength());
			System.err.println("子节点如下：");
			for (int i = 0; i < collegeNodes.getLength(); i++) {
				Node college = collegeNodes.item(i);
				if (college == null)
					continue;
				if (college.getNodeType() == Node.ELEMENT_NODE) {
					System.err.println("\t元素节点：" + college.getNodeName());
				} else if (college.getNodeType() == Node.TEXT_NODE) {
					System.err.println("\t文本节点：" + Arrays.toString(college.getTextContent().getBytes()));
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
