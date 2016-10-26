package Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Beans.Coffre;
import Beans.ClientBanque;
import java.util.List;
import Beans.ListeCoffresBoutique;
import DataModels.BoutiqueDataModels;
import Models.BoutiqueModels;
import Models.ConnexionForm;

/**
 * Created by pcthomas on 25/10/2016.
*/
public class BoutiqueController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String nom = (String) session.getAttribute("nomClient");
        String prenom = (String) session.getAttribute("prenomClient");

        if((nom != null) && (prenom != null)){

            BoutiqueDataModels lDataModel = new BoutiqueDataModels();
            request.setAttribute("listeCoffre", lDataModel.GetListCoffre());
            this
                    .getServletContext()
                    .getRequestDispatcher( "/WEB-INF/Boutique.jsp" )
                    .forward( request, response );
        }else{
            this
                    .getServletContext()
                    .getRequestDispatcher( "/WEB-INF/Connexion.jsp" )
                    .forward( request, response );
        }
    }
}