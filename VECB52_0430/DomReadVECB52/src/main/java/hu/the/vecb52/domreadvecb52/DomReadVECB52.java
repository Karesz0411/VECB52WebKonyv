/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hu.the.vecb52.domreadvecb52;

import java.io.*;

import org.xml.sax.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
/**
 *
 * @author Hallgató
 */
public class DomReadVECB52 {

    public static void main(String[] args) {
        try {
            File xmlFile = new File("C:\\MKgit\\VECB52WebKonyv\\VECB52_0430\\DomReadVECB52\\src\\main\\java\\hu\\the\\vecb52\\domreadvecb52\\orarendVECB52.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            
            Element rootElement = document.getDocumentElement();
            
            System.out.println("A gyökér elem neve: " + rootElement.getTagName());
            
            NodeList children = rootElement.getChildNodes();
            
            /*
            for (int i = 0; i < children.getLength(); i++) {
                Node node = children.item(i);
                
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Első gyermek: " + element.getTagName());

                    NodeList childNodes = element.getChildNodes();
                    
                    for (int j = 0; j < childNodes.getLength(); j++) {
                        Node childNode = childNodes.item(j);
                        
                        if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                            Element childElement = (Element) childNode;
                            String textContent = childElement.getTextContent().trim();
                            System.out.println(childElement.getTagName() +": " + textContent);
                        }
                    }
                }
            }*/
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
