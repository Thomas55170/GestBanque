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




        DataModels.OperationDataModels lDataModel = new DataModels.OperationDataModels();
        ListeOperation ListeOperation=lDataModel.Test();
        request.setAttribute("ListeOperation", ListeOperation);
        this
                .getServletContext()
                .getRequestDispatcher( "/WEB-INF/ListeOperation.jsp" )
                .forward( request, response );
    }


}
