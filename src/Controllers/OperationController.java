package Controllers;

import Beans.Operation;
import Models.ConnexionForm;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import Beans.ListeOperation;

public class OperationController extends HttpServlet {



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        HttpSession session = request.getSession();

        String nom = (String) session.getAttribute("nomClient");
        String prenom = (String) session.getAttribute("prenomClient");

        if((nom != null) && (prenom != null)){


            DataModels.OperationDataModels lDataModel = new DataModels.OperationDataModels();

            request.setAttribute("ListeOperation", lDataModel.GetListOperation());
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
