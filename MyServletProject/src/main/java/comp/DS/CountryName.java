package comp.DS;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/country")
public class CountryName extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
	TreeMap<String,Country> countryMap = new TreeMap<String,Country>();

    public CountryName() {
    	
    	Country c1 = new Country("India", "New Delhi", "Mr. Narendra Modi", "136.64 Crores", "Rs");
    	Country c2 = new Country("Pakistan", "Islamabad", "Mr. Imran Khan", "21.66 Crores", "Pakistani Rupee");
    	Country c3 = new Country("China", "Beijing", "Mr. Xi Jinping", "139.77 Crores", "Yuan");
    	Country c4 = new Country("England", "London", "Mr. Boriss Johnson", "6.66 Crores", "Pound Sterling");
    	Country c5 = new Country("America", "Washington DC", "Mr. Joe Biden", "32.82 Crores", "USD");
    	countryMap.put("IND", c1);
		countryMap.put("PAK", c2);
		countryMap.put("CHI", c3);
		countryMap.put("UK", c4);
		countryMap.put("US", c5);
System.out.println("Country()...."); 

// TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init()....");   	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Destroy()....");   	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	    System.out.println("\t\tservice()");
	    response.setContentType("text/html");
	    String country =  request.getParameter("countryName"); //read this HTML tag's value
	    PrintWriter pw = response.getWriter();
	    if(countryMap.containsKey(country)) {
	    	Country foundCountry = countryMap.get(country);
	    	pw.println("<h2> The capital of "+foundCountry.name+" is "+foundCountry.capital+"</h2>");	    	
	    }
	}
}	   