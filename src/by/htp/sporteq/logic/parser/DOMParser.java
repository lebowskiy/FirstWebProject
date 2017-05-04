package by.htp.sporteq.logic.parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class DOMParser {

	public static ArrayList<ArrayList<String>> readXML() {
		try {
			File xmlFile = new File("C:/Java EE Neon/SportEquipmentWeb/WebContent/resources/products.xml");
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(xmlFile);
			document.getDocumentElement().normalize();

			NodeList nodeList = document.getDocumentElement().getChildNodes();

			ArrayList<ArrayList<String>> equipList = new ArrayList<>();

			for (int i = 0; i < nodeList.getLength(); i++) {
				ArrayList<String> equip = new ArrayList<>();
				Node node = nodeList.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					equip.add(nodeList.item(i).getNodeName());
					equip.add(element.getElementsByTagName("category").item(0).getChildNodes().item(0).getNodeValue());
					equip.add(element.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue());
					equipList.add(equip);
				}
			}

			return equipList;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
