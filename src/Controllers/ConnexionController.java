package Controllers;

/**
 * Created by pcthomas on 24/10/2016.
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.ClientBanque;
import Models.ConnexionForm;

public class ConnexionController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        this.getServletContext().getRequestDispatcher( "/WEB-INF/Connexion.jsp" ).forward( request, response );

    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        /* Préparation de l'objet formulaire */
        ConnexionForm form = new ConnexionForm();

        /* Appel au traitement et à la validation de la requête, et récupération du bean en résultant */
        ClientBanque client = form.connexionClient(request);


        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute("form", form);
        request.setAttribute("nom", client.getNom());

        // Si Objet client est renvoyé alors on redirige vers la page MonCompte

        this.getServletContext().getRequestDispatcher("/WEB-INF/MonCompte.jsp").forward( request, response );
    }
}
