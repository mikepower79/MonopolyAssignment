package edu.ncsu.monopoly;

public interface IOwnable {
	public abstract boolean playAction(String msg);
	
	public abstract void setAvailable(boolean available);
	
	public abstract String getName();

	public abstract Player getTheOwner();

	public abstract int getPrice();
	
}
