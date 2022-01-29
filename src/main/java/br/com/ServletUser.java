package br.com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.entidades.User;

/**
 * Servlet implementation class ServletUser
 */
@WebServlet("/ServletUser")
public class ServletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUser() {
        super();
        // TODO Auto-generated constructor stub
    }
static ArrayList<User> cont = new ArrayList<User>();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath()); 
		StringBuffer saida = new StringBuffer();
		saida.append("<tbody>");
	    for(User usuario : cont) {
		    saida.append("<tr>");
			saida.append("<td>" + usuario.getNome() + "</td>");
			saida.append("<td>" + usuario.getEmail() + "</td>");
			saida.append("<td>" + usuario.getTelefone() + "</td>");
			saida.append("</tr>");
		}
		saida.append("</tbody>");
	}
	 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		if((request.getParameter("nome") != null) && (request.getParameter("email") != null) && (request.getParameter("pais") != null) && (request.getParameter("telefone") != null)) {
			 ServletOutputStream out = response.getOutputStream();
			    response.setContentType("text/html");                  
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String telefone = request.getParameter("telefone");
			String pais = request.getParameter("pais");
			
			User user = new User(nome, email, pais, telefone); // instacia usuario

			 //requestScope - forward
			
		}
		
		request.getRequestDispatcher("/").forward(request, response);  // rediciona para ele mesmo 
		
	}

}
