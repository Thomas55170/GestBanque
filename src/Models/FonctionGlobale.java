package Models;


import com.sun.deploy.util.SessionState;
import jdk.internal.org.xml.sax.InputSource;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by pcthomas on 06/10/2016.
 */
public class FonctionGlobale {

    //EN COURS DE REALISATION
	public static ArrayList ParseXMLToArray(String f, String nomObj)
	{
		File file = new File("data/"+f);

		ArrayList<Object> liste = new ArrayList<>();

		try
		{
			DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = db.parse(file);
			NodeList nodes = doc.getElementsByTagName(nomObj);
			Object obj = new Object();

			//JAXBContext jc = JAXBContext.newInstance(OperationXML.class);
			//JAXBContext jc2 = JAXBContext.newInstance(OperationXMLs.class);
			///Unmarshaller unmarshaller = jc.createUnmarshaller();
			//Marshaller marshaller = jc2.createMarshaller();

			for(int i = 0; i < nodes.getLength(); i++)
			{
				//JAXBElement<Object> je = unmarshaller.unmarshal(nodes.item(i), OperationXML.class);

                final Element nom = (Element) doc.getElementsByTagName("nom").item(0);
                final Element prenom = (Element) doc.getElementsByTagName("prenom").item(0);

				//OperationXML ope = je.getValue();
				//lesOperations.add(ope);
			}

			/*for(int j = 0; j < lesOperations.size(); j++) {
				System.out.println("Opération n°" + (j + 1) + " " + lesOperations.get(j).TypeCoffre);

				//Constitu un fichier xml par objet
				jaxbObjectToXML(lesOperations.get(j),j);
			}

			//Constitu un fihcier contenant autant de noeuds que d'objets contenu dans operas
			operas.operations = lesOperations;
			marshaller.marshal(operas,new File("assets/lesOperations.xml"));*/

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}

		return liste;
	}


}
