package DataModels;

import Beans.ListeClientBanque;
import Beans.ListeOperation;
import Beans.Operation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class OperationDataModels {

    private static final String PathToXML =  "Base_Operation_2016.xml";


    // TODO: 25/10/2016  Implement it
    public boolean ListeOperation(){ return true;}



    public Beans.ListeOperation Test(){

        ListeOperation lListeOperation = new ListeOperation();

        try{
            JAXBContext lContext = JAXBContext.newInstance(ListeOperation.class);
            Unmarshaller lUnmarsheller = lContext.createUnmarshaller();
            lListeOperation = (ListeOperation) lUnmarsheller.unmarshal( new File(this.PathToXML));

           return lListeOperation;

        } catch (JAXBException e){
            e.printStackTrace();
            return null;
        }




    }
}
