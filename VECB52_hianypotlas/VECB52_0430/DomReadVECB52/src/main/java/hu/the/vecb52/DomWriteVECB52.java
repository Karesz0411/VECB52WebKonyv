package hu.the.vecb52;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import org.xml.sax.SAXException;

public class DomWriteVECB52 {

    public static void main(String[] args) throws SAXException, IOException, TransformerException {
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

            Document dom_document = db.newDocument();
            Element dom_document_root = dom_document.createElement(doc.getDocumentElement().getNodeName());
            dom_document.appendChild(dom_document_root);

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;

                    String id = element.getAttribute("id");

                    Attr attribute_id =  dom_document.createAttribute("id");
                    attribute_id.setValue(element.getAttribute("id"));
                    Element lesson_element = dom_document.createElement("lesson");
                    lesson_element.setAttributeNode(attribute_id);

                    Attr attribute_type =  dom_document.createAttribute("type");
                    attribute_type.setValue(element.getAttribute("type"));
                    lesson_element.setAttributeNode(attribute_type);
                    dom_document_root.appendChild(lesson_element);


                    String course = element.getElementsByTagName("course").item(0).getTextContent();
                    String teacher = element.getElementsByTagName("teacher").item(0).getTextContent();
                    String location = element.getElementsByTagName("location").item(0).getTextContent();
                    String major = element.getElementsByTagName("major").item(0).getTextContent();

                    Element course_element = dom_document.createElement("course");
                    course_element.setTextContent(element.getElementsByTagName("course").item(0).getTextContent());
                    lesson_element.appendChild(course_element);

                    Element teacher_element = dom_document.createElement("teacher");
                    teacher_element.setTextContent(element.getElementsByTagName("teacher").item(0).getTextContent());
                    lesson_element.appendChild(teacher_element);

                    Element location_element = dom_document.createElement("location");
                    location_element.setTextContent(element.getElementsByTagName("location").item(0).getTextContent());
                    lesson_element.appendChild(location_element);

                    Element major_element = dom_document.createElement("major");
                    major_element.setTextContent(element.getElementsByTagName("major").item(0).getTextContent());
                    lesson_element.appendChild(major_element);

                    NodeList timeNodeList = element.getElementsByTagName("time");

                    if (timeNodeList.getLength() > 0) {
                        Element timeElement = (Element) timeNodeList.item(0);
                        String day = timeElement.getElementsByTagName("day").item(0).getTextContent();
                        String startTime = timeElement.getElementsByTagName("start").item(0).getTextContent();
                        String endTime = timeElement.getElementsByTagName("end").item(0).getTextContent();

                        Element time_element = dom_document.createElement("time");

                        Element day_element = dom_document.createElement("day");
                        day_element.setTextContent(timeElement.getElementsByTagName("day").item(0).getTextContent());
                        time_element.appendChild(day_element);

                        Element start_element = dom_document.createElement("start");
                        start_element.setTextContent(timeElement.getElementsByTagName("start").item(0).getTextContent());
                        time_element.appendChild(start_element);

                        Element end_element = dom_document.createElement("end");
                        end_element.setTextContent(timeElement.getElementsByTagName("end").item(0).getTextContent());
                        time_element.appendChild(end_element);

                        lesson_element.appendChild(time_element);

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

            FileOutputStream my_xml_write = new FileOutputStream("C:\\MKgit\\VECB52WebKonyv\\VECB52_hianypotlas\\VECB52_0430\\DomReadVECB52\\src\\main\\java\\hu\\the\\vecb52\\VECB52_1orarend.xml");

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // Set indentation
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2"); // Set indentation amount
            DOMSource source = new DOMSource(dom_document);
            StreamResult result = new StreamResult(my_xml_write);

            transformer.transform(source, result);

        }
        catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
