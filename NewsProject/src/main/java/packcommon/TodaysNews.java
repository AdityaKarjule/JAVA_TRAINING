package packcommon;

public class TodaysNews
	{	private static String news="";
		
		public synchronized static void addNews(String str)
			{	news = new String(news+str);
				System.out.println("within todays news "+str+"|"+news);}
		
		public synchronized static void clearNews()
			{	news = "";	}
		
		public synchronized static String readNews()
			{	if (news == null)
					return ("No news today");
				return news;
			}
	}