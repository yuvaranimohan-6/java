package salaryservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Credentialchecker
 */
@WebFilter("/salary")
public class Credentialchecker implements Filter {

    /**
     * Default constructor. 
     */
    public Credentialchecker() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String uname=request.getParameter("txtUname");
		String pword=request.getParameter("txtPassword");
		PrintWriter out=response.getWriter();
		if(uname.equalsIgnoreCase("yuvarani") && pword.equals("1234")){
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
		
		else
			out.println("Invalid Username or Password");
		
	}
	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}