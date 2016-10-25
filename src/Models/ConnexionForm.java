package Models;

import Beans.ClientBanque;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * Created by pcthomas on 24/10/2016.
 */
public final class ConnexionForm extends HttpServlet {
    private static final String CHAMP_LOGIN  = "login";
    private static final String CHAMP_PASS   = "password";

    public ClientBanque connexionClient (HttpServletRequest request ) {

        String nom =  request.getParameter(CHAMP_LOGIN);
        String prenom =  request.getParameter(CHAMP_PASS);

        ClientBanque client = new ClientBanque();
        client.setNom(nom);
        client.setPrenom(prenom);
        //Lire le fichier XML
        // Testé la présence du client dans le fichier
            // Créer la session
        //renvoyé le client ou vide

        System.out.println("Par ici !!!!"+nom+" "+prenom);
        String file = "Client.xml";
        System.out.println("ar ici !!!!"+file);
        ArrayList objList = ParseXMLToArray(file);

       /* boolean bool = false;

        for (Object x: objList) {
            if ((prenom == x.Prenom) && (nom == x.Nom)){
                ClientBanque client = new ClientBanque();
                client.setNom(nom);
                client.setPrenom(prenom);
                bool = true;
                break;
            }else{
                bool = false;
            }
        }

        if(bool == true){

           // HttpSession session = request.getSession();
           // session.setAttribute("Client", client);

            return client;
        }else{
            return client;
        }*/

       return client;
    }

    public static ArrayList ParseXMLToArray(String file){

       // Scanner scanner = null;
        //try {
            //scanner = new Scanner(new FileReader(file));
        //} catch (FileNotFoundException e) {
            //e.printStackTrace();
        //}
        /*String str = null;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            // suite du traitement
        }
        return str;*/


        File xmlFile = new File(file);
        System.out.println("ICI"+xmlFile);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        ArrayList<ClientBanque> objList = new ArrayList<ClientBanque>();

        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("ListingClient");

            //now XML is loaded as Document in memory, lets convert it to Object List
            System.out.println("AVANT BOUCLE" + nodeList.getLength());
            for (int i = 0; i < nodeList.getLength(); i++) {
                System.out.println("DANS BOUCLE" + nodeList.item(i));
                objList.add(getClient(nodeList.item(i)));
            }
            //lets print Employee list information
            for (ClientBanque cl : objList) {
                System.out.println(cl.toString());
            }
        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }
        return objList;
    }

    private static ClientBanque getClient(Node node) {
        //XMLReaderDOM domReader = new XMLReaderDOM();
        ClientBanque cl = new ClientBanque();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            cl.setNom(getTagValue("name", element));
            cl.setPrenom(getTagValue("prenom", element));
            cl.setId(Integer.parseInt(getTagValue("id", element)));
        }
        System.out.println(cl.toString());
        return cl;
    }

    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }



}
