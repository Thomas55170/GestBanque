package Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.ClientBanque;
import Beans.ListeCoffresBoutique;
import Models.BoutiqueModels;
import Models.ConnexionForm;

/**
 * Created by pcthomas on 25/10/2016.
*/
public class BoutiqueController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /* Préparation de l'objet formulaire*/
        BoutiqueModels boutique = new BoutiqueModels();

        /* Appel au traitement et à la validation de la requête, et récupération du bean en résultant*/
        ListeCoffresBoutique ListeCoffre = boutique.AfficheCoffres();

        request.setAttribute("listeCoffre", ListeCoffre);

        this
                .getServletContext()
                .getRequestDispatcher( "/WEB-INF/Boutique.jsp" )
                .forward( request, response );
    }
}