package Models;

import Beans.ClientBanque;
import Beans.ListeClientBanque;

import javax.servlet.http.HttpServlet;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by pcthomas on 25/10/2016.
 */
public class BoutiqueModels extends HttpServlet {

    public boolean AfficheCoffres(){

        BoutiqueModels BoutiqueModels = new BoutiqueModels();
        boolean check = false;

        try{
            JAXBContext lContext = JAXBContext.newInstance(.class);
            Unmarshaller lUnmarsheller = lContext.createUnmarshaller();
            lListeClientBanque = (ListeClientBanque) lUnmarsheller.unmarshal( new File(this.PathToXML));

            for (ClientBanque iClient: lListeClientBanque.getListeClientBanque()){
                System.out.println( iClient.toString());

                if (prenom.equals(iClient.getPrenom()) && (nom.equals(iClient.getNom()))){
                    check = true;
                    break;
                }else{
                    check = false;
                }

            }

        } catch (JAXBException e){
            e.printStackTrace();
        }

        return check;

    }

}
