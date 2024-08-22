import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import java.io.File;

public class Bank { 
   public static void main(String argv[]) {
      try {

	   //Here is to create the document builder and object
	   DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	   DocumentBuilder builder = factory.newDocumentBuilder();
	   Document doc = builder.newDocument(); //create new xml doc
   
         //Create root element
	   Element rootElement = doc.createElement("bank");
	   doc.appendChild(rootElement);


	   Element queue1 = doc.createElement("queue");		   
         rootElement.appendChild(queue1);
	   
	   Attr id1 = doc.createAttribute("id");
	   id1.setValue("2001");
         queue1.setAttributeNode(id1);
	
	   Element description1 = doc.createElement("description");
	   description1.appendChild(doc.createTextNode("Open Bank Account"));
         queue1.appendChild(description1);
 

	   Element state1 = doc.createElement("state");
	   state1.appendChild(doc.createTextNode("Melaka"));
         queue1.appendChild(state1);

	   Element district1 = doc.createElement("district");
	   district1.appendChild(doc.createTextNode("Ayer Keroh"));
         queue1.appendChild(district1);

	   Element address1 = doc.createElement("address");
	   address1.appendChild(doc.createTextNode("105, Jalan Tasik, Ayer Keroh, 75450 Melaka"));
         queue1.appendChild(address1);


	   Element date1 = doc.createElement("date");
	   date1.appendChild(doc.createTextNode("14.12.2022"));
         queue1.appendChild(date1);


	   Element time1 = doc.createElement("time");
	   time1.appendChild(doc.createTextNode("10.20am"));
         queue1.appendChild(time1);


	   Element name1 = doc.createElement("name");
	   name1.appendChild(doc.createTextNode("Alice Lim"));
         queue1.appendChild(name1);


	   Element ic1 = doc.createElement("ic");
	   ic1.appendChild(doc.createTextNode("000523081024"));
         queue1.appendChild(ic1);

	   Element contact1 = doc.createElement("contact");
	   contact1.appendChild(doc.createTextNode("0176355982"));
         queue1.appendChild(contact1);
	   
   	   Element email1 = doc.createElement("email");
	   queue1.appendChild(email1);	
	   Attr href1 = doc.createAttribute("href");
	   href1.setValue("alicelim20@gmail.com");
         email1.setAttributeNode(href1);

         Element queue2 = doc.createElement("queue");		   
         rootElement.appendChild(queue2);
	   
	   Attr id2 = doc.createAttribute("id");
	   id2.setValue("2002");
         queue2.setAttributeNode(id2);
	
	   Element description2 = doc.createElement("description");
	   description2.appendChild(doc.createTextNode("Withdraw Money"));
         queue2.appendChild(description2);


	   Element state2 = doc.createElement("state");
	   state2.appendChild(doc.createTextNode("Melaka"));
         queue2.appendChild(state2);

	   Element district2 = doc.createElement("district");
	   district2.appendChild(doc.createTextNode("Ayer Keroh"));
         queue2.appendChild(district2);

	   Element address2 = doc.createElement("address");
	   address2.appendChild(doc.createTextNode("105, Jalan Tasik, Ayer Keroh, 75450 Melaka"));
         queue2.appendChild(address2);


	   Element date2 = doc.createElement("date");
	   date2.appendChild(doc.createTextNode("14.12.2022"));
         queue2.appendChild(date2);


	   Element time2= doc.createElement("time");
	   time2.appendChild(doc.createTextNode("10.21am"));
         queue2.appendChild(time2);


	   Element name2 = doc.createElement("name");
	   name2.appendChild(doc.createTextNode("Brandon Chong"));
         queue2.appendChild(name2);


	   Element ic2 = doc.createElement("ic");
	   ic2.appendChild(doc.createTextNode("600504013829"));
         queue2.appendChild(ic2);

	   Element contact2 = doc.createElement("contact");
	   contact2.appendChild(doc.createTextNode("0108466724"));
         queue2.appendChild(contact2);
	   
   	   Element email2 = doc.createElement("email");
	   queue2.appendChild(email2);	
	   Attr href2 = doc.createAttribute("href");
	   href2.setValue("brandonchong@gmail.com");
         email2.setAttributeNode(href2);
                                
                
        // write the content into xml file
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();

         // pretty print XML
         transformer.setOutputProperty(OutputKeys.INDENT, "yes");
         transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
         DOMSource source = new DOMSource(doc);
         StreamResult result = new StreamResult(new File("Bank.xml"));
         transformer.transform(source, result);
         
         // Output to console for testing
         StreamResult consoleResult = new StreamResult(System.out);
         transformer.transform(source, consoleResult);
         

                 
        
       
      }
      catch (Exception e) {
         System.out.println(e); 
      }
   }
}
