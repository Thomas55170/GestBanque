package Controllers;

import java.io.IOException;
import javax.faces.model.DataModel;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.ClientBanque;
import Models.ConnexionForm;

public class ConnexionController extends HttpServlet {

    public boolean checkLogin(String aLogin, String aPassword){
        return true;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        DataModels.LoginDataModels lDataModel = new DataModels.LoginDataModels();
        lDataModel.Test();
        this
                .getServletContext()
                .getRequestDispatcher( "/WEB-INF/Connexion.jsp" )
                .forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

        /* Préparation de l'objet formulaire */
        ConnexionForm form = new ConnexionForm();

        /* Appel au traitement et à la validation de la requête, et récupération du bean en résultant */
        ClientBanque client = form.connexionClient(request);

        HttpSession session = request.getSession();

        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute("form", form);
        request.setAttribute("prenom", client.getPrenom());

        // Si Objet client est renvoyé alors on redirige vers la page MonCompte

        this
                .getServletContext()
                .getRequestDispatcher("/WEB-INF/MonCompte.jsp")
                .forward( request, response );
    }
}
