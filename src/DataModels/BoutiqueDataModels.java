package DataModels;

import Beans.Coffre;
import Beans.ListeCoffresBoutique;

import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by etienne on 26/10/2016.
 */
public class BoutiqueDataModels {

    private static final String PathToXML =  "Base_Coffre_2016.xml";

    // TODO: 26/10/2016  Implement it
    public boolean CreateBoutique(){ return true;}

    // TODO: 26/10/2016  Implement it
    public boolean EditBoutique(){ return true;}

    // TODO: 26/10/2016  Implement it
    public boolean DropBoutique(){return true;}

    public List<Coffre> GetListCoffre(){

        ListeCoffresBoutique lListeCoffresBoutique = new ListeCoffresBoutique();

        try{
            JAXBContext lContext = JAXBContext.newInstance(ListeCoffresBoutique.class);
            Unmarshaller lUnmarsheller = lContext.createUnmarshaller();
            lListeCoffresBoutique = (ListeCoffresBoutique) lUnmarsheller.unmarshal( new File(this.PathToXML));

            return lListeCoffresBoutique.getListeCoffresBoutique();

        } catch (JAXBException e){
            e.printStackTrace();
        }

        return null;

    }
}
