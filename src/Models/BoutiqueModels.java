package Models;

import Beans.Coffre;
import Beans.ListeCoffresBoutique;
import DataModels.BoutiqueDataModels;

import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;



/**
 *
 * Created by pcthomas on 25/10/2016.
*/

public class BoutiqueModels extends HttpServlet {

    /*private static final String CHAMP_COMMANDE  = "select_commande";

    public Boolean newCoffre (HttpServletRequest request ) {

        String commande =  request.getParameter(CHAMP_COMMANDE);

        BoutiqueDataModels boutique = new BoutiqueDataModels();
        Boolean bool = boutique.AddCoffre(commande);
        //ClientBanque client = login.GetUserInformation(nom,prenom);

        if(bool){
            return true;

        }else{
            return false;
        }
    }
*/
}
