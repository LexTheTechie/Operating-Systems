package com.gamingroom;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {

	private static List<Team> teams = new ArrayList<Team>();
	

	
	public Game(long id, String name) {
		super(id, name);
	}
	//iterator pattern for the addTeam method for the Team List 
	public Team addTeam(String name) {

		Team team = null;
		Iterator<Team>teamsIterator = teams.iterator();
		while (teamsIterator.hasNext()) {
			Team teamInstance = teamsIterator.next();
			if(teamInstance.getName() == name) {
				team = teamInstance;
			}
			else if (team == null) {
				GameService service = GameService.getInstance();
				team = new Team(service.getNextTeamId(), name);
				teams.add(team);
				}

		// return the new/existing team instance to the caller
		
}
	return team;
	}
	@Override
	public String toString() {
		
		return "Game [id=" + super.getId() + ", name=" + super.getName() + "]";
	}

}
