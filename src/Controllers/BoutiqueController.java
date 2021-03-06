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
        BoutiqueDataModels lDataModel = new BoutiqueDataModels();
        HttpSession session = request.getSession();

        String nom = (String) session.getAttribute("nomClient");
        String prenom = (String) session.getAttribute("prenomClient");

        if((nom != null) && (prenom != null)){

            BoutiqueDataModels boutique = new BoutiqueDataModels();
            request.setAttribute("listeCoffre",  boutique.GetListCoffre());

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

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String champ_commande  = "select_commande";
        String commande =  request.getParameter(champ_commande);

        BoutiqueDataModels boutique = new BoutiqueDataModels();
       // Boolean bool = boutique.AddCoffre(Integer.parseInt(commande));

        this
                .getServletContext()
                .getRequestDispatcher( "/WEB-INF/Boutique.jsp" )
                .forward( request, response );

    }
}