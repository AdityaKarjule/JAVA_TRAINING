package packreader;

import javax.servlet.http.HttpServletRequest;

public class ServletUtilities
	{	public static int getIntParameter(HttpServletRequest request, String paramName, int defaultValue)
			{	String paramString = request.getParameter(paramName);
				int paramValue;
				try { paramValue=Integer.parseInt(paramString);
					}
				catch(NumberFormatException nfe)
					{	paramValue=defaultValue;	}	
				return(paramValue);
			}
		public static final String DOCTYPE = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
			"Transitional //EN\">";
		public static String headWithTitle(String title)
			{	return(DOCTYPE+"\n"+"<HTML>\n"+"<HEAD><TITLE>"+title+"</TITLE></HEAD>\n");	}
	}
