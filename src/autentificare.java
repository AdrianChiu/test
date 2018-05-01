
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Servlet implementation class autentificare
 */
@WebServlet("/autentificare")
public class autentificare extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final JPanel panel = new JPanel();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public autentificare() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("Utilizator");
		String password = request.getParameter("Parola");
		
		String autentificare = request.getParameter("Autentificare");
		String informatiiAsociatie = request.getParameter("InformatiiAsociatie");
		
		if (autentificare != null) {
			if (name.equals("asocrev63") && password.equals("rev63")) {
				response.sendRedirect("Documente.jsp");
			} else {
				JOptionPane.showMessageDialog(panel, "Eroare de autentificare, nume de utilizator sau parola incorecte", "Eroare", JOptionPane.ERROR_MESSAGE);
				response.sendRedirect("autentificare.jsp");
			}
		}
		if (informatiiAsociatie != null) {
			ContactAs c = new ContactAs();
			c.show();
			response.sendRedirect("autentificare.jsp");
		}
	}
}
