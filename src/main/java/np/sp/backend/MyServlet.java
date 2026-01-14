package np.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// backend code
		
		PrintWriter out = resp.getWriter();
	    out.print("This is a backend doGet() method" );
		
		System.out.println("This is a backend doGet() method");
		
		
	}
}
