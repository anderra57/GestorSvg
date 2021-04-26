package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import HTTPeXist.HTTPeXist;

/**
 * Servlet implementation class NewImage
 */

public class NewImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewImage() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HTTPeXist eXist = new HTTPeXist("http://localHost:8080");
		
		String collection = request.getParameter("collection");
		String svgName = request.getParameter("svgName");
		String resource = "<svg></svg>";

		eXist.subirString(collection, resource, svgName);
		
		request.setAttribute("collection",collection);
		request.setAttribute("svgName",svgName);
		request.setAttribute("imagenSVG",resource);
		String imagenURI = "http://localhost:8080/exist/rest/db/" + collection + "/" + svgName + "/";
		request.setAttribute("imagenURI",imagenURI);
		
		System.out.println("     Redireccionando a imagenEdit.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/imagenEdit.jsp");
		rd.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
	}

}
