package DataModels;

import Beans.ClientBanque;
import Beans.ListeOperation;
import Beans.Operation;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OperationDataModels {

    private static final String PathToXML =  "Base_Operation_2016.xml";


    // TODO: 25/10/2016  Implement it
    public boolean ListeOperation(){ return true;}


    public List<Operation> GetListOperation(int idClient){

        ListeOperation lListeOperation = new ListeOperation();

        ArrayList<Operation> operations = new ArrayList<Operation>();

        try{
            JAXBContext lContext = JAXBContext.newInstance(ListeOperation.class);
            Unmarshaller lUnmarsheller = lContext.createUnmarshaller();
            lListeOperation = (ListeOperation) lUnmarsheller.unmarshal( new File(this.PathToXML));

            for (Operation operation: lListeOperation.getListeOperation())
            {

                if (operation.getClientBanque() == idClient) {
                    operations.add(operation);
                }
            }
            return operations;
        } catch (JAXBException e){
            e.printStackTrace();
            return null;
        }

    }
}
