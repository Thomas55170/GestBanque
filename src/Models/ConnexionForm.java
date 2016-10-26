package Models;

import Beans.ClientBanque;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import DataModels.LoginDataModels;

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

    public Boolean connexionClient (HttpServletRequest request ) {

        String nom =  request.getParameter(CHAMP_LOGIN);
        String prenom =  request.getParameter(CHAMP_PASS);


        //Lire le fichier XML
        // Testé la présence du client dans le fichier
            // Créer la session
        //renvoyé le client ou vide

        //System.out.println("Par ici !!!!"+nom+" "+prenom);
        //String file = "Client.xml";
        //System.out.println("ar ici !!!!"+file);
       // ArrayList objList = ParseXMLToArray(file);

        LoginDataModels login = new LoginDataModels();
        Boolean bool = login.CheckUsers(nom, prenom);
        ClientBanque client = login.GetClient(nom,prenom);

        if(bool == true){
            if (client != null) {
                HttpSession session = request.getSession();
                session.setAttribute("idClient", client.getId());
                session.setAttribute("nomClient", nom);
                session.setAttribute("prenomClient", prenom);
                return true;
            }
        }else{
            return false;
        }
        return false;
    }
}
