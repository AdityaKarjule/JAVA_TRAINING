
public class PackageTest {
	public static void main(String[] args) {
		
	}
}
/*
 
 	Package = similar to a directory
 	 
 	 
 	 				java <-- main package
 	 				|
 	 	-----------------------------
 	 	|						|
 	 	lang <-- sub package	awt
 		|						|
 	---------				----------
 	|						|
 	System				Button
 	Thread				TextField
 	String				TextArea
 	Exception			Label
 	
 
 unix : jungle/cave 
 
 windows : jungle\cave
 
 java : jungle.cave
 
 
 					jungle <-- main folder
 					|
 		------------------------------
 		|		|		|		|
 		cave	tree	river	use <-- sub-folders
 		|		|		|		|
 	Tiger		Parrot	Fish	Test	
 				Monkey	Crocodile



	private - can only be referred by the declaring class
	protected - can only be referred by the child class
				via extends keyword - in any package
				BengalTiger - in diff package
				
				
				
				can be referred by the non-child
				class within the same package
				(Monkey and Tiger in cave )
				
				
	public - can be referred by anyone - anywhere

	default - can only be referred by the same package
	 		child/non-child class
	 		
*/ 
