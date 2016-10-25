package Controllers;

/**
 * Created by pcthomas on 15/10/2016.
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class DemoServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{


        String action = request.getParameter("action");

        /*String paramAuteur = request.getParameter( "auteur" );
        String message = "Transmission de variables : OK ! " + paramAuteur;


        /* Création du bean */
        //Banque premierBean = new Banque();
	    /* Initialisation de ses propriétés */
        //premierBean.setDesignation("BNP Parisbas");

	    /* Stockage du message et du bean dans l'objet request */
        //request.setAttribute( "banque", premierBean );
        //request.setAttribute("message", message);

        request.setAttribute("action", action);

        this.getServletContext().getRequestDispatcher( "/WEB-INF/demo.jsp" ).forward( request, response );

    }


}
