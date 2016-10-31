package Controllers;

import Beans.Coffre;
import Beans.Operation;
import Models.ConnexionForm;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;

import Beans.ListeOperation;

public class OperationController extends HttpServlet {



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        HttpSession session = request.getSession();

        String nom = (String) session.getAttribute("nomClient");
        String prenom = (String) session.getAttribute("prenomClient");



        if((nom != null) && (prenom != null)){

            int idClient  = (int) session.getAttribute("idClient");
            DataModels.OperationDataModels lDataModel = new DataModels.OperationDataModels();

            DataModels.BoutiqueDataModels lBoutiqueDataModel = new DataModels.BoutiqueDataModels();
            List<Coffre> coffres = lBoutiqueDataModel.getCoffreUser(idClient);

            //ArrayList<Object> tabFinal = new ArrayList<>();

            Vector vect = new Vector();

            for (Coffre iCoffre: coffres){

                iCoffre.setOperation(lDataModel.GetListOperationByCoffre(idClient, iCoffre.getId()));

                vect.addElement(iCoffre);
                //vect.addElement(lDataModel.GetListOperationByCoffre(idClient, iCoffre.getId()));
            }


            request.setAttribute("ListeOperation", vect);

            this
                    .getServletContext()
                    .getRequestDispatcher( "/WEB-INF/ListeOperation.jsp" )
                    .forward( request, response );
        }else{
            this
                    .getServletContext()
                    .getRequestDispatcher( "/WEB-INF/Connexion.jsp" )
                    .forward( request, response );
        }
    }
}
