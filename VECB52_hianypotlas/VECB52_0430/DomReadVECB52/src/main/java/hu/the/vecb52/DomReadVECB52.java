package hu.the.vecb52;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import org.xml.sax.SAXException;

public class DomReadVECB52 {

    public static void main(String[] args) throws SAXException, IOException {
        String vecb52_xml = "C:\\MKgit\\VECB52WebKonyv\\VECB52_hianypotlas\\VECB52_0430\\DomReadVECB52\\src\\main\\java\\hu\\the\\vecb52\\VECB52_orarend.xml";

        DocumentBuilderFactory document_builder_factory = DocumentBuilderFactory.newInstance();

        try {
            document_builder_factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            DocumentBuilder db = document_builder_factory.newDocumentBuilder();

            Document doc = db.parse(new File(vecb52_xml));

            doc.getDocumentElement().normalize();

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

            DOMSource source = new DOMSource(doc);
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);

        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
