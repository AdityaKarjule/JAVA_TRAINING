

public class GenericTest2 {
	public static void main(String[] args) {
		
		Youtube y1 = new Youtube("MN","Rider", 2014);
		Youtube y2 = new Youtube("FB","Pilot",2015);
		AnyValues<Youtube> yt = new AnyValues<Youtube>(y1, y2);
		
		yt.print();
		yt.swap();
		yt.print();
		
		AnyValues<Integer> iv = new AnyValues<Integer>(10, 20);
		
		iv.print();
		iv.swap();
		iv.print();
		
		System.out.println("-------------");
		
		AnyValues<Float> fv = new AnyValues<Float>(10.5f, 20.6f);
		fv.print();
		fv.swap();
		fv.print();
		
		System.out.println("---------------");
		
		AnyValues<String> sv = new AnyValues<String>("Wada", "Paav");
		sv.print();
		sv.swap();
		sv.print();

		System.out.println("---------------");

		Song s1 = new Song("Zhinghat", "Ajay Atul", "Sairat", 2016);
		Song s2 = new Song("My Heart Will Go On","Celine Dior","Titanic",1997);
		
		AnyValues<Song> songVa = new AnyValues<Song>(s1, s2);
		songVa.print();
		songVa.swap();
		songVa.print();
	}
}

class AnyValues<T> 
{
	T x; 
	T y; 
	
	AnyValues(T x,T y) { 
		this.x = x;
		this.y = y;
	}
	void print() { // <-- algorithm
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap() { // <-- algorithm
		System.out.println("swapping....");
		T temp = x;
		x = y;
		y = temp;
		System.out.println("swapped.....");
	}
}


class SongValues // <-- container
{
	Song x; // <-- content
	Song y; // <-- content
	
	SongValues(Song x,Song y) { 
		this.x = x;
		this.y = y;
	}
	void print() { // <-- algorithm
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap() { // <-- algorithm
		System.out.println("swapping....");
		Song temp = x;
		x = y;
		y = temp;
		System.out.println("swapped.....");
	}
}


class IntegerValues
{
	int x;
	int y;
	
	IntegerValues(int x,int y) {
		this.x = x;
		this.y = y;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap() {
		System.out.println("swapping....");
		int temp = x;
		x = y;
		y = temp;
		System.out.println("swapped.....");
	}
}

class FloatValues
{
	float x;
	float y;
	
	FloatValues(float x,float y) {
		this.x = x;
		this.y = y;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap() {
		System.out.println("swapping....");
		float temp = x;
		x = y;
		y = temp;
		System.out.println("swapped.....");
	}
}

class StringValues
{
	String x;
	String y;
	
	StringValues(String x,String y) {
		this.x = x;
		this.y = y;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap() {
		System.out.println("swapping....");
		String temp = x;
		x = y;
		y = temp;
		System.out.println("swapped.....");
	}
}


class Song
{
	String title;
	String artist;
	String album;
	int year;
	public Song(String title, String artist, String album, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year + "]";
	}
	
	
}


class Youtube{
	String channel;
	String contentCreator;
	int year;
	
	public Youtube(String channel, String contentCreator, int year) {
		super();
		this.channel = channel;
		this.contentCreator = contentCreator;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Youtube [channel=" + channel + ", contentCreator=" + contentCreator + ", year=" + year + "]";
	}
	
	
}