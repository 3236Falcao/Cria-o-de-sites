package contato;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Contato extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter estrutura = response.getWriter();
		
		estrutura.println("<html>");
		estrutura.println("<head>");
		estrutura.println("<title>Primeira Servlet</title>");
		estrutura.println("</head>");
		estrutura.println("<body>");
		estrutura.println("<h1>Utilizando Servlets na Apex");
		estrutura.println("<a href=\"http://localhost:8080/Desenvolvimento_de_site/inicio\">Inicio</a>");
		estrutura.println("<a href=\"http://localhost:8080/Desenvolvimento_de_site/sobre\">Sobre</a>");
		estrutura.println("<a href=\"http://localhost:8080/Desenvolvimento_de_site/contato\">Contato</a>");
		estrutura.println("<h3>Você está na página de contato");
		estrutura.println("</body>");
		estrutura.println("</html>");
		
		
			}
		
		}
