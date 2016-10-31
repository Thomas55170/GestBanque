package DataModels;

import Beans.ClientBanque;
import Beans.Coffre;
import Beans.ListeClientBanque;
import Beans.ListeCoffresBoutique;
import Beans.MesCoffres;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by etienne on 26/10/2016.
 */
public class BoutiqueDataModels {

    private static final String PathToXML =  "Base_Coffre_2016.xml";

    // TODO: 26/10/2016  Implement it
   /* public boolean AddCoffre(Integer commande){

        ClientBanque lMesCoffres = new ClientBanque();
        Boolean check=false;
        ClientBanque cl = new ClientBanque();
        try{
            JAXBContext lContext = JAXBContext.newInstance(ClientBanque.class);
            Unmarshaller lUnmarsheller = lContext.createUnmarshaller();
            lMesCoffres = (ClientBanque) lUnmarsheller.unmarshal( new File("Base_Client_2016.xml"));

            for (MesCoffres iCoffres: lMesCoffres.getMesCoffres()){

            }



        } catch (JAXBException e){
            e.printStackTrace();
        }
        return false;
    }*/

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
            return null;
        }

    }

    public Coffre GetOneCoffre(Integer id) {

        ListeCoffresBoutique lListeCoffresBoutique = new ListeCoffresBoutique();
        Coffre c = new Coffre();

        try {
            JAXBContext lContext = JAXBContext.newInstance(ListeCoffresBoutique.class);
            Unmarshaller lUnmarsheller = lContext.createUnmarshaller();
            lListeCoffresBoutique = (ListeCoffresBoutique) lUnmarsheller.unmarshal(new File(this.PathToXML));

            for (Coffre iCoffre : lListeCoffresBoutique.getListeCoffresBoutique()) {
                if (id.equals(iCoffre.getId())) {
                    c = iCoffre;
                    break;
                }
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return c;
    }

    public List<Coffre> getCoffreUser(Integer idClient){
        ListeClientBanque lListeCoffresClient = new ListeClientBanque();

        ArrayList<Coffre> coffreUser= new ArrayList<Coffre>();

        try{
            JAXBContext lContext = JAXBContext.newInstance(ListeClientBanque.class);
            Unmarshaller lUnmarsheller = lContext.createUnmarshaller();
            lListeCoffresClient = (ListeClientBanque) lUnmarsheller.unmarshal( new File("Base_Client_2016.xml"));

            //return lListeCoffresClient.getListeClientBanque();
            for (ClientBanque iClient : lListeCoffresClient.getListeClientBanque()) {

                if (idClient.equals(iClient.getId())) {
                    for(MesCoffres iCoffre : iClient.getMesCoffres()){
                        Coffre c = GetOneCoffre(iCoffre.getIdCoffre());
                        coffreUser.add(c);
                    }
                }
            }


        } catch (JAXBException e){
            e.printStackTrace();
            return null;
        }
        return coffreUser;
    }


}
