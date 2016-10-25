package DataModels;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import Beans.ClientBanque;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import Beans.ClientBanque;
import Beans.ListeClientBanque;

public class LoginDataModels {

    private static final String PathToXML =  "Base_Client_2016.xml";


    // TODO: 25/10/2016  Implement it
    public boolean CreateUser(){ return true;}

    // TODO: 25/10/2016  Implement it
    public boolean EditUser(){ return true;}

    // TODO: 25/10/2016  Implement it
    public boolean DropUser(){return true;}

    public Beans.ClientBanque GetUser(String Nom, String Prenom){

        return null;
    }

    public boolean CheckIfUserExist(String Nom, String Prenom){
        return true;
    }


    public void Test(){
        ListeClientBanque lListeClientBanque = new ListeClientBanque();

        try{
            JAXBContext lContext = JAXBContext.newInstance(ListeClientBanque.class);
            Unmarshaller lUnmarsheller = lContext.createUnmarshaller();
            lListeClientBanque = (ListeClientBanque) lUnmarsheller.unmarshal( new File(this.PathToXML));

            for (ClientBanque iClient: lListeClientBanque.getListeClientBanque()){
                System.out.println( iClient.toString());
            }
        } catch (JAXBException e){
            e.printStackTrace();
        }




    }
}
