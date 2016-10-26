package Models;

import Beans.Coffre;
import Beans.ListeCoffresBoutique;

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

    private static final String PathToXML =  "Base_Coffre_2016.xml";

    public ListeCoffresBoutique AfficheCoffres(){

        ListeCoffresBoutique lListeCoffresBoutique = new ListeCoffresBoutique();
        boolean check = false;

        try{
            JAXBContext lContext = JAXBContext.newInstance(ListeCoffresBoutique.class);
            Unmarshaller lUnmarsheller = lContext.createUnmarshaller();
            lListeCoffresBoutique = (ListeCoffresBoutique) lUnmarsheller.unmarshal( new File(this.PathToXML));

            //for (Coffre iCoffre: lListeCoffresBoutique.getListeCoffresBoutique()){

            //}

        } catch (JAXBException e){
            e.printStackTrace();
        }

        return lListeCoffresBoutique;

    }

}
