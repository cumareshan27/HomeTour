package com.revature.fixture;

public class Room extends Fixture {

	private int n, s, w, e;
	
	private Room[] exits;

	public Room[] getExits() {
		return this.exits;
	}

	public Room getExit(String direction) {
		return null;
	}

	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	public Room(String name, String shortDescription, String longDescription, int n, int s, int w, int e) {
		super(name, shortDescription, longDescription);
		this.n = n;
		this.s = s;
		this.w = w;
		this.e = e;
		this.exits = new Room[6];
	}

}
