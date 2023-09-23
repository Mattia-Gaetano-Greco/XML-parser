package XMLReaderLaboratorio;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

class XMLReader {

    private static HashMap<Integer, Macchina> getMacchineFromXML(String fileName) {
        HashMap<Integer, Macchina> macchine = new HashMap<Integer, Macchina>();
        DocumentBuilderFactory builder = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder parser = builder.newDocumentBuilder();
            Document document = parser.parse(new File(fileName));
            document.getDocumentElement().normalize();

            NodeList list = document.getElementsByTagName("macchina");

            for (int temp = 0; temp < list.getLength(); temp++) {
                Node node = list.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    Macchina macchina = new Macchina(
                        Integer.parseInt(element.getAttribute("numero")),
                        element.getAttribute("ip"),
                        element.getAttribute("mac"),
                        element.getElementsByTagName("processore").item(0).getTextContent(),
                        Integer.parseInt(element.getElementsByTagName("ram").item(0).getTextContent()),
                        element.getElementsByTagName("scheda_grafica").item(0).getTextContent(),
                        element.getElementsByTagName("sistema_operativo").item(0).getTextContent()
                    );
                    macchine.put(macchina.getNumero(), macchina);
                }
            }
            
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return macchine;
    }

    public static HashMap<Integer, Macchina> getMacchineFromXML(String XMLPath, String XSDPath) {
        if (XMLSchemaValidator.validateXMLSchema(XMLPath, XSDPath))
            return getMacchineFromXML(XMLPath);
        return null;
    }
    
}