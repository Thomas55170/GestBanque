package Controllers;

import Beans.ClientBanque;
import Beans.Coffre;
import Beans.MesCoffres;
import Beans.Operation;
import DataModels.LoginDataModels;
import Models.BoutiqueModels;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pcthomas on 26/10/2016.
 */
public class CompteController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        String lNom = (String) session.getAttribute("nomClient");
        String lPrenom = (String) session.getAttribute("prenomClient");
        Integer idClient  = (Integer) session.getAttribute("idClient");

        if((lNom != null) && (lPrenom != null)){

            DataModels.OperationDataModels lDataModel = new DataModels.OperationDataModels();
            List<Operation> operations = lDataModel.GetListOperation(idClient);


            DataModels.BoutiqueDataModels lBoutiqueDataModel = new DataModels.BoutiqueDataModels();
            List<Coffre> coffres = lBoutiqueDataModel.getCoffreUser(idClient);

            request.setAttribute("nom", lNom);
            request.setAttribute("prenom", lPrenom);
            request.setAttribute("ListeOperation", operations);
            request.setAttribute("ListeCoffre", coffres);

            this
                    .getServletContext()
                    .getRequestDispatcher( "/WEB-INF/MonCompte.jsp" )
                    .forward( request, response );
        }else{
            this
                    .getServletContext()
                    .getRequestDispatcher( "/WEB-INF/Connexion.jsp" )
                    .forward( request, response );
        }
    }

}
