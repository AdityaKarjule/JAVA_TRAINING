package packeditor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import packcommon.TodaysNews;

@WebServlet("/editor")
public class EditorServlet extends HttpServlet
	{	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException
			{	String action = arg0.getParameter("action");
				String news	  = arg0.getParameter("news");
				
				if (action.trim().equalsIgnoreCase("add"))
					TodaysNews.addNews(news);
				if (action.trim().equalsIgnoreCase("clear"))
					TodaysNews.clearNews();
			}

		protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException
			{	doGet(arg0, arg1);	}	
	}
