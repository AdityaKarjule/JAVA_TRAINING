
public class InterThreadBatBall {


public static void main(String[] args) {
	
 PlaySport sport = new PlaySport("Cricket"); 
	
	Batter e = new Batter(sport);
	Bowler s = new Bowler(sport); 
	
	s.start();
	e.start(); 
}
}
interface Batting
{
void bat();
}
interface Bowling
{
void bowl();
}

class PlaySport implements Batting, Bowling
{
String name;
boolean itemServed; 

PlaySport(String item) {
	name = item;
}


public synchronized void bat() { 
	if(itemServed==false) {
		System.out.println("Bat() : Waiting for the player to "
				+ " bat...");
		try {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	System.out.println("bat(): Player is batting..."+name);
}


public synchronized void bowl() { 
	if(itemServed==false) {
		System.out.println("bowl :  ball is being bowled....");
		itemServed=true;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify(); 
	}
}
}

class Batter extends Thread 
{	
PlaySport sport;

Batter(PlaySport fi) {
	sport = fi;
}

public void run() {
	sport.bat();
}
}
class Bowler extends Thread
{
PlaySport sport;

Bowler(PlaySport fi) {
	sport = fi;
}
public void run() {
	sport.bowl();
}
}