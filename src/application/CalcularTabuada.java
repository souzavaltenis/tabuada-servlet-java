package application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcularTabuada")
public class CalcularTabuada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		int tabuada = Integer.parseInt(request.getParameter("tabuada"));
		
		try (PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet meuServ tw www</title>");
			out.println("</head>");
			out.println("<h1>Serverlet meu serv at " + request.getContextPath() + "</h1>");
			for(int i=0; i<=10; i++)
				out.println(tabuada + " x " + i + " = " + tabuada * i +"<br />");
			out.println("</body>");
			out.println("</html>");
		}
	}

}