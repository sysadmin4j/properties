package net.intact.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Show
 */
@WebServlet("/Show")
public class Show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Show() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				PrintWriter out = response.getWriter();
		        //out.println("Hello World");
		        
		 
		        //final Properties properties = new Properties();
		        //properties.load(net.intact.properties.getResourceAsStream("test.properties"));
		        //properties.load(this.getClass().getResourceAsStream("test.properties"));
		        //out.println(properties.getProperty("toto"));
		        
		        //redhat
		        //Thread.currentThread().getContextClassLoader().getResource("test.properties");
		       
		        
		        //URL url = ClassLoader.getSystemResource("test.properties");
		        //try{
		        //properties.load(url.openStream());
		        //}catch(Exception e)
		        //{
		        //   e.printStackTrace();
		        //}
		        //out.println(properties.getProperty("toto"));
		        //System.out.println("------- By Using URL class -------");
		        //System.out.println(properties.getProperty("toto"));
		        
		        Properties props = new Properties();
		        URL url = Thread.currentThread().getContextClassLoader().getResource("test.properties");
		        String strUrl = url.toString();
		        out.println("url of properties file ="+strUrl);
		        System.out.println("url of properties file ="+strUrl);
		        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("test.properties");
		        props.load(is);
		        System.out.println("properties are loaded from properties file ");
		        String totoProperty = props.getProperty("toto");                
		        out.println("TOTO property = " + totoProperty);
		        System.out.println("TOTO property = " + totoProperty);
		        

		        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
