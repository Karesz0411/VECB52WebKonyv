
package hu.the.vecb52;

/**
 *
 * @author Hallgató
 */
import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
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

            System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            System.out.println("------");

            NodeList list = doc.getElementsByTagName("lesson");

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;

                    String id = element.getAttribute("id");

                    String course = element.getElementsByTagName("course").item(0).getTextContent();
                    String teacher = element.getElementsByTagName("teacher").item(0).getTextContent();
                    String location = element.getElementsByTagName("location").item(0).getTextContent();
                    String major = element.getElementsByTagName("major").item(0).getTextContent();

                    NodeList timeNodeList = element.getElementsByTagName("time");

                    if (timeNodeList.getLength() > 0) {
                        Element timeElement = (Element) timeNodeList.item(0);
                        String day = timeElement.getElementsByTagName("day").item(0).getTextContent();
                        String startTime = timeElement.getElementsByTagName("start").item(0).getTextContent();
                        String endTime = timeElement.getElementsByTagName("end").item(0).getTextContent();

                        System.out.println("Current Element :" + node.getNodeName());
                        System.out.println("Staff Id : " + id);
                        System.out.println("Course : " + course);
                        System.out.println("Teacher : " + teacher);
                        System.out.println("Location : " + location);
                        System.out.println("Major : " + major);
                        System.out.println("Day : " + day);
                        System.out.println("Start Time : " + startTime);
                        System.out.println("End Time : " + endTime);
                        System.out.println();
                    }
                    else {
                        System.out.println("Warning: No time information found for lesson with id: " + id);
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}

