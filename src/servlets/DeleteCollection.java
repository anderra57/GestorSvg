package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import HTTPeXist.HTTPeXist;

/**
 * Servlet implementation class DeleteCollection
 */
public class DeleteCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCollection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HTTPeXist eXist = new HTTPeXist("http://localHost:8080");
		
		String collection = request.getParameter("collection");
	
		int status = eXist.delete(collection);
		
		if (status == 200) {
			request.setAttribute("informacion", "Colección "+collection+" borrada correctamente");
		} else {
			request.setAttribute("informacion", "Ha habido un problema. Inténtalo de nuevo. (Código "+status+")");
		}
		
		
		System.out.println("     Redireccionando a index.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/index.jsp");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		rd.forward(request, response);
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
