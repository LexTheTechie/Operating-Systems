package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game, next player , and next team ID identifiers
	 */
	private static long nextGameId = 1;
	
	private static long nextPlayerId = 1;
	
	private static long nextTeamId = 1;
	
	private static GameService service = null;
		
	private GameService() {
		
	}
	public static GameService getInstance() {
		if(service == null) {
			service = new GameService();
			System.out.println("Loading new game service . . . ");
		}
		
		return service; 
		
	}
	

	public Game addGame(String name) {

		// a local game instance
		Game game = null;
		
		Iterator<Game>gamesIterator = games.iterator();
		while (gamesIterator.hasNext()) {
		Game gameInstance = gamesIterator.next();
		if(gameInstance.getName() == name) {
		game = gameInstance;
		break;
		}
		}


		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {
		Game game = null;
		
		Iterator<Game>gamesIterator = games.iterator();
		while (gamesIterator.hasNext()) {
		Game gameInstance = gamesIterator.next();
			if(gameInstance.getId() == id) {
			return gameInstance;
		
			}
		}		
		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {
		Game game = null; 
		
		Iterator<Game>gamesIterator = games.iterator();
		while (gamesIterator.hasNext()) {
		Game gameInstance = gamesIterator.next();
			if(gameInstance.getName() == name) {
			return gameInstance;
		}
		}
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}

	public long getNextPlayerId() {
		return nextPlayerId++;
	
	}

	public long getNextTeamId() {
		return nextTeamId++;

	}
}
