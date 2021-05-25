package com.revature.fixture;

public class Room extends Fixture {

	private Room[] exits;

	public Room[] getExits() {
		return this.exits;
	}

	public Room getExit(String direction) {
		return null;
	}

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[20];
	}

}
