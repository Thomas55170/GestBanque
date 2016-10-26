package Controllers;

import Beans.ListeCoffresBoutique;
import Models.BoutiqueModels;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by pcthomas on 26/10/2016.
 */
public class CompteController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        String nom = (String) session.getAttribute("nomClient");
        String prenom = (String) session.getAttribute("prenomClient");
        if((nom != null) && (prenom != null)){

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
