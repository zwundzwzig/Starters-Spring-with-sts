package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class DispatcherServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7158503461708901720L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String uri = req.getRequestURI(); // http://localhost:8081/nonspringmvc/hello
		String uri_array[] = uri.split("/");
		String result = uri_array[uri_array.length - 1]; // hello
		System.out.println(result);
		
		// hello -> HelloController -> HelloDTO -> hello.jsp
		// list -> ListController -> ArrayList<HelloDTO> -> list.jsp
		HandlerMapping mappings = new HandlerMapping();
		Controller controller = mappings.getController(result);
		String viewName = controller.handleRequest(req, res);
		
		RequestDispatcher rd = req.getRequestDispatcher(viewName);
		rd.forward(req, res);
	}

}
