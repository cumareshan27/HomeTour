//Followed this tutorial for logics of the game, https://www.youtube.com/watch?v=pFSYsJE0vRs&list=PLZHx5heVfgEvT5BD8TgLmGrr-V64pX7MD&index=3 

package revature.com.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.revature.fixture.*;

public class Game {
	private ArrayList <Room>map;
	private Player player;
	
	//https://www.geeksforgeeks.org/arrays-aslist-method-in-java-with-examples/
	List<String> commands = new ArrayList<>(Arrays.asList("moveNorth", "moveSouth", "moveWest", "moveEast"));
	
	public Game() {
		this.map = new ArrayList<Room>();
		
		map.add(new Room("Dinning Room", "Place to Dine","Room with Formal Dinning table" , 1, 2, Direction.NOEXIT, Direction.NOEXIT));
		map.add(new Room("Living Room", "Primary Living","Room to gather and entertain" , 1, 2, 3, 4));
		map.add(new Room("Great Room", "Entertaining","Gather as a family" , 1, 2, 3, Direction.NOEXIT));
		map.add(new Room("Laundry Room", "Utility","Mud room" , 1, Direction.NOEXIT, Direction.NOEXIT, Direction.NOEXIT));
		
	}
}
